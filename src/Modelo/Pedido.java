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
public class Pedido {
  
  private String id;
  private String orden;
  private String fecha;
  private String nombre;

  public Pedido() {
  }

  public Pedido(String id, String orden, String fecha, String nombre) {
    this.id = id;
    this.orden = orden;
    this.fecha = fecha;
    this.nombre = nombre;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrden() {
    return orden;
  }

  public void setOrden(String orden) {
    this.orden = orden;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  
  
}
