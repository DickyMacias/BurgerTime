
package Modelo;


public abstract class Burger {
  
  private int pan;
  private int carne;
  private int condimentos;

  public Burger(int pan, int carne, int condimentos) {
    this.pan = pan;
    this.carne = carne;
    this.condimentos = condimentos;
  }

  public int getPan() {
    return pan;
  }

  public void setPan(int pan) {
    this.pan = pan;
  }

  public int getCarne() {
    return carne;
  }

  public void setCarne(int carne) {
    this.carne = carne;
  }

  public int getCondimentos() {
    return condimentos;
  }

  public void setCondimentos(int condimentos) {
    this.condimentos = condimentos;
  }
  
  public abstract void ajustarInventario();
  
  public abstract void hacerPedido();
  
}
