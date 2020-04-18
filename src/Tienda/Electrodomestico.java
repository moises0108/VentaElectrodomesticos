
package Tienda;


public abstract class Electrodomestico {
    
    protected double precioBase;
    protected int consumo;
    protected int peso;
    
    public Electrodomestico(double precioBase, int consumo, int peso){
        
        this.precioBase = precioBase;
        this.consumo = consumo;
        this.peso = peso;
        
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public abstract void mostrar();
    public abstract void precioFinal();
}
