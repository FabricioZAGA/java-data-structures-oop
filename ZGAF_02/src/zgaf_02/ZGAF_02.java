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
package zgaf_02;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ZGAF_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClsCalculadora puto = new ClsCalculadora(leer("Valor 1"),leer("Valor 2"));
        puto.sumar();
        puto.restar();
        puto.multiplicar();
        puto.dividir();
        puto.potenciar();
    }
    public static double leer(String name)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa el valor del " + name + ": ");
 
        return read.nextDouble();
    }
    
}
