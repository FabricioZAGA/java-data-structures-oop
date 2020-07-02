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
package zgaf_09;

/**
 *
 * @author fabri
 */
public class Cola {
    private Pivote LD;
    private Pivote LI;
    public Cola()
    {
        LD = null;
        LI = null;
    }
    void InsertarElemento(int elemento)
    {
        Pivote pivote = new Pivote();
        pivote.Numero = elemento;
        pivote.Siguiente = null;
        if (Empty())
        {
            LI = pivote;
            LD = pivote;
        }
        else 
        {
            LI.Siguiente = pivote;
            LI = pivote;
        }
    }
    int ExtraerElemento()
    {
        if(!Empty())
        {
            int elemento = 0;
            if (LD == LI)
            {
                LD = null;
                LI = null;
            }
            else
            {
                LD = LD.Siguiente;
            }
            return elemento;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }
    boolean Empty()
    {
        if (LD == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
