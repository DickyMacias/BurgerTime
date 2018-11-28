/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author dicky
 */
public class Factory {
  
      public Burger hacerBurger(String tipo){
      Burger burger = null;
   
      if (tipo.equals("Pollo Burger")){
        burger = new PolloBurger(1,1,1);  
      }else if (tipo.equals("Vaca Burger")){
        burger = new VacaBurger(1,1,1);
      }else if (tipo.equals("Onion Burger")){
        burger = new OnionBurger(1,1,1);
      }
      
      burger.hacerPedido();
      burger.ajustarInventario();
      return burger;
    }
  
}
