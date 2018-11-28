
package Controlador;
import Modelo.Burger;
import Modelo.Factory;
import Modelo.LasBurgers;
import Modelo.Pedido;
import Modelo.PedidoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.JFInicio;
import java.awt.event.*;
import javax.swing.*;

public class ControladorGerente implements ActionListener {
    
    JFInicio viewWelcome= new JFInicio();
    UsuarioDAO modelWelcome = new UsuarioDAO();
    Usuario empleado = new Usuario();
    ProductoDAO modelInventario = new ProductoDAO();
    Producto inventario = new Producto();
    String id, password, position;
    String pan, pollo, vaca, onion, condimentos;
    JTable table = new JTable();
    Factory factory;
    LasBurgers burgers;
    
    public ControladorGerente (JFInicio viewWelcome, UsuarioDAO modelWelcome){
        this.viewWelcome=viewWelcome;
        this.modelWelcome=modelWelcome;
        this.viewWelcome.btnInformacion.addActionListener(this);
        this.viewWelcome.btnInventario.addActionListener(this);
        this.viewWelcome.btnPollo.addActionListener(this);
    }
 
    
    public void abrirInicio(String id, String password, String position){
        this.id=id;
        this.password=password;
        this.position=position;
    }
    
    public void abrirInventario(String pan, String pollo, String vaca, String onion, String condimentos){
      this.pan=pan;
      this.pollo=pollo;
      this.vaca=vaca;
      this.onion=onion;
      this.condimentos=condimentos;
    }
    
    public void actionPerformed(ActionEvent e){    
      if(e.getSource() == viewWelcome.btnInformacion){
        empleado = modelWelcome.verificarUsuario(id, password, position);
        JOptionPane.showMessageDialog(viewWelcome,"Informacion de Usuario: \n"
        +"Nombre: " + empleado.getLastName()+ ", " 
        + empleado.getPassword() + "\n"
        +"Puesto: " + empleado.getPosition());
      }else if(e.getSource() == viewWelcome.btnInventario){ 
        inventario = modelInventario.verInventario(pan,pollo,vaca,onion,condimentos);
        JOptionPane.showMessageDialog(viewWelcome,"Inventario: \n"
        +"Pan: " + inventario.getPan()+"\n"
        + "Pollo: " + inventario.getPollo() +"\n"
        + "Vaca: " + inventario.getVaca() +"\n"
        + "Onion: " + inventario.getOnion() +"\n"
        + "Condimentos: " + inventario.getCondimentos() +"\n");
      } 
 
    }
         
  }
    

