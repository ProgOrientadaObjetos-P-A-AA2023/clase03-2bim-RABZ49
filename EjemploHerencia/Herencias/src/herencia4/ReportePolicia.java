/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c,ArrayList<Policia> milista) {
        super(c);
        
        lista = milista;
    }

    

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public void calcularPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Policia> x) {
        lista = x;
    }
@Override
    public String toString() {
        String x = "Reporte Policias\n";
        x = String.format("%sCodigo:%s\n",x,codigo );
        x = String.format("%sLista de Policias\n", x);
        
        for (int i = 0; i < obtenerLista().size(); i++) {
            Policia p  = obtenerLista().get(i);
            x = String.format("%sNombre: %s - Edad: %s\n",x,
                    p.getNombre(),p.getEdad() );
            
        }
        x = String.format("%s\nEl promedio de Edades es: "
                + "%.3f\n-----------------------------\n", x,
                obtenerPromedioEdades());
        return x;
    }

}
