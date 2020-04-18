
package Tienda;


public class Televisor extends Electrodomestico{
    
        private double altura;
        
    public Televisor(double precioBase, int consumo, int peso, double altura){
        
        super(precioBase, consumo, peso);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void mostrar(){
        System.out.println("\nEl precio base es de: "+precioBase);
        System.out.println("El consumo electrico es de: "+consumo);
        System.out.println("El peso es de: "+peso);
        System.out.println("El tamaño es de: "+altura);
        precioFinal();
    }
    public void precioFinal(){
        double precioFinal;int precioPeso,precioConsumo;
        if(peso>0 && peso<=19){
            precioPeso =10;
        }else if(peso>19 && peso<=49){
            precioPeso =50;
        }else if(peso>49 && peso<=79){
            precioPeso= 80;
        }else{
            precioPeso=100;
        }
        if (consumo==1) {
            precioConsumo=100;
        }else if (consumo==2) {
            precioConsumo = 60;
        }else{
            precioConsumo = 30;
        }
        precioFinal = precioPeso+precioConsumo+precioBase;
        if (altura>40) {
            precioFinal = precioFinal*1.3;
        }
        System.out.println("El precio final es: "+precioFinal);
    }
}
