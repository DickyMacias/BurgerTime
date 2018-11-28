
package Modelo;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PedidoDAO {
    SingletonBD connection;
    
    public PedidoDAO(){
        connection = new SingletonBD();
    }
    
    public Pedido revisarPedidos(String id, String orden, String fecha, String nombre){
        Pedido pedido = null;
        java.sql.Connection accesoDB = connection.getConnection();
        try {
         PreparedStatement ps= accesoDB.prepareStatement ("select * from t_pedido");   
         ps.setString (1, id);
         ps.setString(2, orden);
         ps.setString(3, fecha);
         ps.setString(4, nombre);
         
         ResultSet rs= ps.executeQuery();
         
         DefaultTableModel pedidos = new DefaultTableModel();
         JTable tabla = new JTable(pedidos);
         
         pedidos.addColumn("id");
         pedidos.addColumn("orden");
         pedidos.addColumn("fecha");
         pedidos.addColumn("nombre");

          // Bucle para cada resultado en la consulta
          while (rs.next())
          {
             // Se crea un array que será una de las filas de la tabla. 
             Object [] fila = new Object[4]; // Hay tres columnas en la tabla

             // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
             for (int i=0;i<4;i++)
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.

             // Se añade al modelo la fila completa.
             pedidos.addRow(fila); 
          }
        }   catch (Exception e){
            System.err.printf(e.getMessage());
        }
        return pedido;
    }
    
}
