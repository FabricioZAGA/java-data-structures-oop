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
package zgaf_08;

/**
 *
 * @author fabri
 */
public class Pila {
    private double P[];
    private int Tope;
    //Constructores
    public Pila(){
        P = new double [100];
        Tope = -1;
    }
    
    public Pila(int a)
    {
        P = new double [a];
        Tope = -1;
    }
    
    // Métodos
    public void Push(double e)
    {
        if (Tope < e)
        {
            P[++Tope] = e;
        }
    }
    
    public String Pop()
    {

            return Double.toString(P[Tope--]);

    }
}
