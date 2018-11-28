/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BurgerTime;
import Controlador.ControladorLogin;
import Modelo.Burger;
import Modelo.OnionBurger;
import Modelo.PolloBurger;
import Modelo.UsuarioDAO;
import Modelo.VacaBurger;
import Vista.JFLogin;
/**
 *
 * @author racna
 */
public class BurgerTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFLogin viewL = new JFLogin();
        UsuarioDAO modelL= new UsuarioDAO();
        ControladorLogin ControllerL= new ControladorLogin(viewL,modelL);
        viewL.setVisible(true);
        viewL.setLocationRelativeTo(null);
    }
    
}
