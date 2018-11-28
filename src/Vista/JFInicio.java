
package Vista;

import Modelo.Pedido;
import Modelo.SingletonBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;

public class JFInicio extends javax.swing.JFrame {

    public JFInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lblWelcome = new javax.swing.JLabel();
    btnInformacion = new javax.swing.JButton();
    btnCancelar = new javax.swing.JButton();
    btnAgregar = new javax.swing.JButton();
    btnPedidos = new javax.swing.JButton();
    btnInventario = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    btnPollo = new javax.swing.JButton();
    btnVaca = new javax.swing.JButton();
    bntOnion = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lblWelcome.setText("Bienvenido Usuario");

    btnInformacion.setText("Informacion");

    btnCancelar.setText("Cancelar");

    btnAgregar.setText("Agregar");

    btnPedidos.setText("Ver Pedidos");
    btnPedidos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPedidosActionPerformed(evt);
      }
    });

    btnInventario.setText("Ver Inventario");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(jTable1);

    btnPollo.setText("PolloBurger");

    btnVaca.setText("VacaBurger");

    bntOnion.setText("OnionBurger");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnCancelar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAgregar)
        .addGap(221, 221, 221))
      .addGroup(layout.createSequentialGroup()
        .addGap(254, 254, 254)
        .addComponent(lblWelcome)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane1))
            .addGap(35, 35, 35))
          .addGroup(layout.createSequentialGroup()
            .addGap(119, 119, 119)
            .addComponent(btnPollo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnVaca)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(bntOnion)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(lblWelcome)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnInventario)
            .addComponent(btnInformacion)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnPollo)
          .addComponent(btnVaca)
          .addComponent(bntOnion))
        .addGap(12, 12, 12)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnCancelar)
          .addComponent(btnAgregar))
        .addContainerGap(38, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
////////   SingletonBD connection;
////////     connection = new SingletonBD();
////////     Pedido pedido = null;
////////     String id="", orden="",fecha="",nombre="";
////////    java.sql.Connection accesoDB = connection.getConnection();
////////    try {
////////         PreparedStatement ps= accesoDB.prepareStatement ("select * from t_pedidos");   
////////         ps.setString (1, id);
////////         ps.setString(2, orden);
////////         ps.setString(3, fecha);
////////         ps.setString(4, nombre);
////////         
////////         ResultSet rs= ps.executeQuery();
////////         
////////         DefaultTableModel pedidos = new DefaultTableModel();
////////         JTable tabla = new JTable(pedidos);
////////         
////////         pedidos.addColumn("id");
////////         pedidos.addColumn("orden");
////////         pedidos.addColumn("fecha");
////////         pedidos.addColumn("nombre");
////////
////////          // Bucle para cada resultado en la consulta
////////          while (rs.next())
////////          {
////////             // Se crea un array que será una de las filas de la tabla. 
////////             Object [] fila = new Object[4]; // Hay tres columnas en la tabla
////////
////////             // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
////////             for (int i=0;i<4;i++)
////////                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
////////
////////             // Se añade al modelo la fila completa.
////////             pedidos.addRow(fila); 
////////          }
////////        }   catch (Exception e){
////////            System.err.printf(e.getMessage());
////////        }
////////      
////////    
  }//GEN-LAST:event_btnPedidosActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicio().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton bntOnion;
  public javax.swing.JButton btnAgregar;
  public javax.swing.JButton btnCancelar;
  public javax.swing.JButton btnInformacion;
  public javax.swing.JButton btnInventario;
  public javax.swing.JButton btnPedidos;
  public javax.swing.JButton btnPollo;
  public javax.swing.JButton btnVaca;
  private javax.swing.JScrollPane jScrollPane1;
  public javax.swing.JTable jTable1;
  public javax.swing.JLabel lblWelcome;
  // End of variables declaration//GEN-END:variables
}
