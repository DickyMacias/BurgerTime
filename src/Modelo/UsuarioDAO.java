
package Modelo;
import java.sql.*;


public class UsuarioDAO {
    SingletonBD connection;
    
    public UsuarioDAO(){
        connection = new SingletonBD();
    }
    
    public Usuario verificarUsuario(String id, String password, String position){
        Usuario empleado = null;
        java.sql.Connection accesoDB = connection.getConnection();
        try {
         PreparedStatement ps= accesoDB.prepareStatement ("select * from t_user where id=? and password=? and position=?");   
         ps.setString (1, id);
         ps.setString(2, password);
         ps.setString(3, position);
         
         ResultSet rs= ps.executeQuery();
         if (rs.next()){
             empleado = new Usuario();
             empleado.setId(rs.getString(1));
             empleado.setPassword(rs.getString(2));
             empleado.setLast_name(rs.getString(3));
             empleado.setName(rs.getString(4));
             empleado.setPosition(rs.getString(5));
             return empleado;
         }
        }   catch (Exception e){
            System.err.printf(e.getMessage());
        }
        return empleado;
    }
    
}
