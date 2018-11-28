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
public class LasBurgers extends Factory {
  
  Factory factory;
  
  public LasBurgers(Burger factory){
    //this.factory = factory;
  }
  
  public Burger pedirBurger(String tipo){
    
    Burger burger;
    
    burger = factory.hacerBurger(tipo);
    
    burger.hacerPedido();
    burger.ajustarInventario();
    
    return burger;
    
  
  }
  
}
