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
package zgaf_pr2_2p;

/**
 *
 * @author fabri
 */
public class Nodo {
        
    //Objeto paciente
    public Paciente paciente = new Paciente();
    
    //Apuntador del siguiente nodo
    public Nodo siguiente =  null;
    
    //Constructor
    public Nodo(int priority, int age, String name, String disease)
    {
        paciente.nombre = name;
        paciente.prioridad = priority;
        paciente.edad = age;
        paciente.enfermedad = disease;
    } 
    
    public Nodo()
    {
        
    }
    
    
    //Método obtención prioridad()
    public int GetPrioridad()
    {
        return paciente.prioridad;
    }
    
    //Método set prioridad
    public void SetPrioridad(int priority)
    {
        paciente.prioridad = priority;
    }
    
    
    //Método obtención edad()
    public int GetEdad()
    {
        return paciente.edad;
    }
    
    //Método set prioridad
    public void SetEdad(int age)
    {
        paciente.edad = age;
    }
    
    
    //Método obtención nombre
    public String GetNombre()
    {
        return paciente.nombre;
    }
    
    //Método set nombre
    public void SetNombre(String name)
    {
        paciente.nombre = name;
    }
    
    public String GetEnfermedad()
    {
        return paciente.enfermedad;
    }
    
    //Método set nombre
    public void SetEnfermedad(String disease)
    {
        paciente.enfermedad = disease;
    }
}
