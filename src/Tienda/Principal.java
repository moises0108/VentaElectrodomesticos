
package Tienda;

import java.io.IOException;
import java.util.ArrayList;
public class Principal {

    public static void main(String[] args) throws IOException{
        ArrayList<Lavadora> lavadoras = new ArrayList();
        ArrayList<Televisor> televisores = new ArrayList();
        Operaciones.leerDocumento(lavadoras, televisores);
        Operaciones.imprimirDocumento(lavadoras, televisores);
    }
}
