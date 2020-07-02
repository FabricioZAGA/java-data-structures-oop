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
package zgaf_05;

/**
 *
 * @author fabri
 */
public class ZGAF_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila(2);
        pila.Push(10);
        pila.Push(5);
        System.out.print(" " + pila.Pop());
        System.out.print(" " + pila.Pop());
        System.out.println(" " + pila.Pop());
    }
    public static int SolicitarLongitudPila ()
    {
        int dato = 0;
        System.out.println("Ingrese los valores a añadir de la pila");
        
        return dato;
    }
    
}
