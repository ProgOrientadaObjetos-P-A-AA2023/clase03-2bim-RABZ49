
package paquete06;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        System.out.println("Ingrese el numero de de estudiantes a ingresar: ");
        int nEstudiantes = entrada.nextInt();
        
        contador = 0;
        while(contador<nEstudiantes){
            
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial "
                    + "Ingrese (2) para Estudiante Distancia");
            
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                
                EstudiantePresencial estudianteP = 
                        new EstudiantePresencial(numeroCreds, costoCred,
                        nombresEst, apellidosEst, edadEst, 
                                identificacionEst);
                
                estudiantes.add(estudianteP);
                
            } else {                            
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();
                    
                    EstudianteDistancia estudianteD = 
                            new EstudianteDistancia(numeroAsigs, 
                                    costoAsig, nombresEst, 
                                    apellidosEst, edadEst, identificacionEst);

                    estudiantes.add(estudianteD);                               
            } 
            contador = contador + 1;
        }

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}