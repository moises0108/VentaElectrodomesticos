
package Tienda;

public class Lavadora extends Electrodomestico{
    
    private int carga;
     
    public Lavadora(double precioBase, int consumo, int peso, int carga){
        
        super(precioBase, consumo, peso);
        this.carga = carga;
        
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal(){
        double precioFinal,precioPeso,precioConsumo,precioCarga = 0;
        if (carga>30) {
            precioCarga =10;
        }
        if(peso>0 && peso<=19){
            precioPeso =10;
        }else if(peso>19 && peso<=49){
            precioPeso =50;
        }else if(peso>49 && peso<=79){
            precioPeso= 80;
        }else{
            precioPeso=100;
        }
        switch (consumo) {
            case 1:
                precioConsumo=100;
                break;
            case 2:
                precioConsumo = 60;
                break;
            default:
                precioConsumo = 30;
                break;
        }
        precioFinal =precioPeso+precioConsumo+precioBase+precioCarga;
        System.out.println("El precio final es: "+ precioFinal);
    }
    @Override
    public void mostrar(){
        System.out.println("\nEl precio base es de: "+precioBase);
        System.out.println("El consumo electrico es de: "+consumo);
        System.out.println("El peso es de "+ peso);
        System.out.println("La carga es de: "+carga+" kg");
        precioFinal();
        
    }
}
