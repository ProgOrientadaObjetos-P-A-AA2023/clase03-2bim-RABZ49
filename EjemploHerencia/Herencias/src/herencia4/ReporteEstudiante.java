/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante( String c,ArrayList<Estudiante> milista) {
        super(c);

        lista = milista;
    }

    

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void calcularPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Estudiante> x) {
        lista = x;
    }

     @Override
    public String toString() {
        String x = "Reporte Estudiante\n";
        x = String.format("%sCodigo:%s\n",x,codigo );
        x = String.format("%sLista de Estudiante\n", x);
        
        for (int i = 0; i < obtenerLista().size(); i++) {
            Estudiante e  = obtenerLista().get(i);
            x = String.format("%sNombre: %s - Matricula: %.1f\n",x,
                    e.getNombre(),e.getMatricula() );
            
        }
        x = String.format("%s\nEl promedio de matriculas es: "
                + "%.3f\n-----------------------------\n", x,
                obtenerPromedioMatriculas());
        return x;
    }
    
}
