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
package zgaf_07;

/**
 *
 * @author fabri
 */
public class Pila {	
    private Pivote Tope;
    
    public Pila () 
    {
        Tope = null;
    }
    
    public void Push(char x) 
    {
        Pivote pivote = new Pivote();
        pivote.Simbolo = x;
        if (Tope == null)
        {
            pivote.Siguiente = null;
            Tope = pivote;
        }
        else
        {
            pivote.Siguiente = Tope;
            Tope = pivote;
        }
    }
    
    public char Pop ()
    {
        if (Tope != null)
        {
            char caracter = Tope.Simbolo;
            Tope = Tope.Siguiente;
            return caracter;
        }
        else
        {
            return Character.MAX_VALUE;
        }
    }  
    
    public boolean Verificar()
    {
        if (Tope == null) {
            return true;
        } else {
            return false;
        }
    }
}
