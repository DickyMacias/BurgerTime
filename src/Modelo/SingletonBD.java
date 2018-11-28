
package Modelo;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SingletonBD { public SingletonBD(){
    
}
    public java.sql.Connection getConnection(){
    java.sql.Connection con=null;
        
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p1","root", "");
        
    } catch (SQLException ex){
        
    }catch (Exception e){
        
    }
    return con;
    }
          
}
