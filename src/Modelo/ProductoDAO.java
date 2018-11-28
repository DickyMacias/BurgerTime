/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dicky
 */
public class ProductoDAO {
  
  SingletonBD connection;
    
    public ProductoDAO(){
        connection = new SingletonBD();
    }
    
    public Producto verInventario(String pan, String pollo, String vaca, String onion, String condimentos){
       Producto producto = null;
        java.sql.Connection accesoDB = connection.getConnection();
        try {
         PreparedStatement ps= accesoDB.prepareStatement ("select * from t_inventario where pan=? and pollo=? and vaca=? and onion=? and condimentos=?");   
         ps.setString (1, pan);
         ps.setString(2, pollo);
         ps.setString(3, vaca);
         ps.setString(4, onion);
         ps.setString(5, condimentos);
         
         ResultSet rs= ps.executeQuery();
         if (rs.next()){
             producto = new Producto();
             producto.setPan(rs.getString(1));
             producto.setPollo(rs.getString(2));
             producto.setVaca(rs.getString(3));
             producto.setOnion(rs.getString(4));
             producto.setCondimentos(rs.getString(5));
             return producto;
         }
        }   catch (Exception e){
            System.err.printf(e.getMessage());
        }
        return producto;
    }
    
  
}
