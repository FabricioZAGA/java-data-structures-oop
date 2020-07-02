/*
 * Universidad De La Salle Bajío.
 * Ingeniería de Software y Sistemas Computacionales
 * Programación Estructurada y Orientada a Objetos
 * Autor: Angel Fabricio Zacarías Guzmán
 * Grupo: 211   Matrícula: 67664
 * Programa:
 * Descripción:
 * Fecha: 0/0/2019
 */
package zgaf_pr1_2p;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ZGAF_PR1_2P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a tu sistema confiable de urgencias PaulinaMed!\n\n-------------------------------------------------------------\n");
        while(bool)
        {
            System.out.println
                ( "Presione 1 para añadir a un nuevo paciente\n"
                + "Presione 2 para ver los pacientes\n"
                + "Presione 3 para pasar al siguiente paciente\n"
                + "Presione 9 para cerrar");
            int res = scanner.nextInt();
            System.out.println("\n");
            if(res == 1)
            {
                IngresarPacientes(cola);
                System.out.println("¡Paciente Añadido!\n");
            }
            if(res == 2)
            {
                try
                {
                    cola.OrdenarLista();  
                }
                catch(Exception error)
                {
                    
                }
                System.out.println("Nombre\tEnfermedad\tEdad\tPrioridad");
                cola.ImprimirLista();
                System.out.println("\n\n");
            }
            if(res == 3)
            {
                try
                {
                    cola.OrdenarLista();  
                }
                catch(Exception error)
                {
                    
                }
                cola.ExtraerElemento();
            }
            if(res == 9)
            {
                bool = false;
            }
        }
    }
    
    
    //Método para ingresar los pacientes;
    public static void IngresarPacientes(Cola cola)
    {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = new Paciente();
        
        System.out.println("Nombre del paciente");
        paciente.nombre = scanner.nextLine();
        
        System.out.println("Enfermedad que presenta");
        paciente.enfermedad = scanner.nextLine();
        
        System.out.println("Ingrese la edad del paciente");
        paciente.edad = scanner.nextInt();
        
        paciente.prioridad = cola.GenerarPrioridad(paciente.edad, paciente.enfermedad);
        
        cola.InsertarElemento(paciente);
    }
}
