
package Controlador;
import javax.swing.*;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.JFInicio;
import Vista.JFLogin;
import java.awt.event.*;

public class ControladorLogin implements ActionListener {
    JFLogin viewLogin = new JFLogin();
    UsuarioDAO modelLogin = new UsuarioDAO();
    Usuario empleado = new Usuario();
    
    public ControladorLogin (JFLogin viewLogin, UsuarioDAO modelLogin){
        this.viewLogin = viewLogin;
        this.modelLogin = modelLogin;
        this.viewLogin.btnGo.addActionListener(this);
    }
    
    public void InitializeLogin(){
    }
    
    public void actionPerformed (ActionEvent e){
        String id = viewLogin.txtID.getText();
        String password = String.valueOf(viewLogin.txtPassword.getPassword());
        String position = String.valueOf(viewLogin.cboPosition.getSelectedItem());
        empleado= modelLogin.verificarUsuario(id,password,position);
        if (empleado==null){
            JOptionPane.showMessageDialog(viewLogin, "Empleado no encontrado");
        }
        else{
            JOptionPane.showMessageDialog(viewLogin, "Contrasena Correcta "
                    + "Bienvenido");
            JFInicio viewG= new JFInicio();
            viewG.lblWelcome.setText("Bienvenido " + empleado.getPassword());
            ControladorGerente controllerW= new ControladorGerente (viewG, modelLogin);
            controllerW.abrirInicio(id,password,position);
            viewG.setVisible(true);
            viewG.setLocationRelativeTo(null);
            viewLogin.setVisible(false); 
        }
        
    }
}


