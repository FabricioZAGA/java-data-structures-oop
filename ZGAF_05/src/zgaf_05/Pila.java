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
public class Pila {
    private int P[];
    private int Tope;
    //Constructores
    public Pila(){
        P = new int [100];
        Tope = -1;
    }
    
    public Pila(int a)
    {
        P = new int [a];
        Tope = -1;
    }
    
    // Métodos
    public void Push(int e)
    {
        if (Tope < e)
        {
            P[++Tope] = e;
        }
    }
    
    public String Pop()
    {
        if (Tope > -1)
        {
            return Integer.toString(P[Tope--]);
        }
        else
        {
            return ("AIUDAAAAAAAAAAAAAAA");
        }
    }
    
}
