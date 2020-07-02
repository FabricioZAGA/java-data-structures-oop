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
public class _Cola {
    private int fr = -1;
    private int fi = -1;
    private int[] cola = null;
    public _Cola (int tam)
    {
        cola = new int[tam];
    }
    public _Cola()
    {
        cola = new int[100];
    }
    public void insertar(int elemento)
    {
        if (!estaVacia())
        {
            fr++;
            fi++;
            cola[fi] = elemento;
        }
        else
        {
            cola[++fi] = elemento;
        }
    }
    public int eliminar()
    {
        if(!estaVacia())
        {
            fi++;
            return cola[++fr];
        }
        else
        {
            return Integer.MAX_VALUE;
        }
        
    }
    public void consultar()
    {
        if (!estaVacia())
        {
            for (int i = fr; i <=fi; i++)
            {
                System.out.print(cola[i] + " ");
            }
        }
    }
    private boolean estaVacia()
    {
        if(fr == -1 && fi == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
