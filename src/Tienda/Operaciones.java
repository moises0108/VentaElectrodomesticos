
package Tienda;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class Operaciones {
    public static void leerDocumento(ArrayList<Lavadora> lavadoras,ArrayList<Televisor> televisores)throws IOException{
        try (Scanner leer = new Scanner(new File("Tienda.txt"))) {
            Lavadora lavadora; Televisor televisor;
            while (leer.hasNext()) {
                if (leer.nextInt()==1) {
                    lavadora = new Lavadora(leer.nextDouble(), leer.nextInt(), leer.nextInt(), leer.nextInt());
                    lavadoras.add(lavadora);
                }
                else{
                    televisor = new Televisor(leer.nextDouble(), leer.nextInt(), leer.nextInt(), leer.nextDouble());
                    televisores.add(televisor);
                }
            }
        }
    }
    public static void imprimirDocumento(ArrayList<Lavadora> lavadoras,ArrayList<Televisor> televisores){
       
        System.out.println("LAVADORA");
        for (int i = 0; i < lavadoras.size(); i++) {
               lavadoras.get(i).mostrar();
        }
        System.out.println("\nTELEVISOR");
        for (int i = 0; i < televisores.size(); i++) {
            televisores.get(i).mostrar();
            
        }
    }
}
