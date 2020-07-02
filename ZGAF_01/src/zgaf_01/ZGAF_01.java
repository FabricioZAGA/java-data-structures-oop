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
package zgaf_01;

/**
 *
 * @author fabri
 */
import java.util.Scanner;

public class ZGAF_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ClsRectangulo puto = new ClsRectangulo(leer("Alto"),leer("Ancho"));
        puto.dibujar();
        puto.generarPerimetro();
        puto.generarArea();
    }
    
    public static int leer(String name)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa el valor de " + name + ": ");
        return read.nextInt();
    }
}
