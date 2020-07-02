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
package zgaf_11;

/**
 *
 * @author fabri
 */
public class Lista {
    //Apuntador al nodo inicial de la lista
    public Nodo listaInicio = null;
    
    //Método para insertar elementos a la lista
    public void InsertarElemento(String name, int priority)
    {
        Nodo nuevoNodo = new Nodo(name, priority);
        Nodo aux;
        
        
        if(listaInicio == null) //Si la lista está vacía 
        {
            listaInicio = nuevoNodo;
        }
        else 
        {
            aux = listaInicio;
            while(aux.siguiente != null)
            {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevoNodo;
        }
    }
    
    public void ImprimirLista()
    {
        Nodo aux = listaInicio;
        while(aux !=  null)
        {
            System.out.println(aux.GetNombre() + "\t" + aux.GetPrioridad());
            aux = aux.siguiente;
        }
    }
}
