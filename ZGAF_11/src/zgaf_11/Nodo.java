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
public class Nodo {
    private String nombre = "";
    private int prioridad = -1;
    
    //Apuntador del siguiente nodo
    public Nodo siguiente =  null;
    
    //Constructor
    public Nodo(String name, int priority)
    {
        this.nombre = name;
        this.prioridad = priority;
    } 
    
    //Método obtención nombre
    public String GetNombre()
    {
        return this.nombre;
    }
    
    //Método set nombre
    public void SetNombre(String name)
    {
        this.nombre = name;
    }
    
    //Método obtención prioridad()
    public int GetPrioridad()
    {
        return this.prioridad;
    }
    
    //Método set prioridad
    public void SetPrioridad(int priority)
    {
        this.prioridad = priority;
    }
}
