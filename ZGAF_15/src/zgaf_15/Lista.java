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
package zgaf_15;

/**
 *
 * @author fabri
 */
public class Lista {
    
    public Nodo nodo = null;
    
    void InsertarElemento(String nombre, int rating)
    {
        // aux = nuevo nodo a insertar
        Nodo aux = new Nodo(rating, nombre);
        // aux2 = nodo auxiliar de insersión y búsqyeda
        Nodo aux2 = nodo;
        if(Vacia())
        {
            nodo = aux; 
        }
        else
        {
            //Se verifica si el primer nodo es mayor al nuevo nodo
            if(nodo.pelicula.rating > rating)
            {
                aux.siguiente = nodo;
                nodo.anterior = aux;
                nodo = aux;
            }
            else
            {
                while(aux2.siguiente != null && aux2.siguiente.pelicula.rating <= rating)
                {
                    aux2 = aux2.siguiente;
                }
                aux.anterior = aux2;
                aux.siguiente = aux2.siguiente;
                aux2.anterior = aux.anterior;
                aux2.siguiente = aux;
            }   
        }
    }
    
    public void ExtraerElemento()
    {
        if (!Vacia())
        {
            Pelicula pelicula = nodo.pelicula;
            nodo = nodo.siguiente;
            nodo.siguiente.anterior = null;
            System.out.println(pelicula.nombre + " dile adiós a tu era en el cine\n");
        }
        else
        {
           System.out.println("No hay ninguna película\n"); 
        }
    }
    
   public void ImprimirLista()
    {
        Nodo aux = nodo;
        while(aux !=  null)
        {
            System.out.println(aux.pelicula.nombre + "\t\t" + aux.pelicula.rating);
            aux = aux.siguiente;
        }
    }
    
    public boolean Vacia()
    {
        if(nodo == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
