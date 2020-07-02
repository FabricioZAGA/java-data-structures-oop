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
package zgaf_12;

/**
 *
 * @author fabri
 */
public class Lista {
    //Apuntador al nodo inicial de la lista
    public Nodo listaInicio = null;
    
    //Método para insertar elementos a la lista
    public void InsertarElemento(int edad, String name, String enfermedad)
    {
        Nodo nuevoNodo = new Nodo(GenerarPrioridad(edad,enfermedad), edad, name, enfermedad);
        
        
        
        if(Vacia()) //Si la lista está vacía 
        {
            listaInicio = nuevoNodo;
        }
        else 
        {
            Nodo aux;
            aux = listaInicio;
            while(aux.siguiente != null)
            {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevoNodo;
        }
    }
    
    
    public void ExtraerElemento ()
    {
        if (!Vacia())
        {
            Paciente paciente = listaInicio.paciente;
            listaInicio = listaInicio.siguiente;
            System.out.println(paciente.nombre + " ha sido atendido\n");
        }
        else
        {
           System.out.println("No hay nadie en la fila de espera\n"); 
        }
    }
    
    public void OrdenarLista()
    {
        int count = 0;
        Nodo aux = listaInicio;
        while(aux.siguiente != null)
        {
            count++;
            aux = aux.siguiente;
        }
        for (int i = 0; i < count; i++) 
        {
            Nodo aux1 = listaInicio;
            Nodo aux2 = listaInicio;
            Nodo aux3 = new Nodo();
            while(aux1.siguiente != null)
            {
                    if (aux1.paciente.prioridad < aux1.siguiente.paciente.prioridad) 
                    {
                        if (aux1 == listaInicio) 
                        {
                            aux3 = aux1.siguiente;
                            aux1.siguiente = aux1.siguiente.siguiente;
                            aux3.siguiente = aux1;
                            listaInicio = aux3;
                            aux1 = listaInicio;
                        }
                        else
                        {
                            aux3 = aux1.siguiente;
                            aux1.siguiente = aux1.siguiente = aux1.siguiente.siguiente;
                            aux3.siguiente = aux1;
                            aux2.siguiente = aux3;
                            aux1 = aux2.siguiente;
                        }

                    }
                aux2 = aux1;
                aux1 = aux1.siguiente;
            }
        }
    }
    
    
    public void ImprimirLista()
    {
        Nodo aux = listaInicio;
        while(aux !=  null)
        {
            System.out.println(aux.GetNombre() + "\t" + aux.GetEnfermedad() + "\t" + aux.GetEdad() + "\t" + aux.GetPrioridad());
            aux = aux.siguiente;
        }
    }
    
    public boolean Vacia()
    {
        if(listaInicio == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int GenerarPrioridad(int edad, String enfermedad)
    {
        int prioridad = 1;
        if (edad < 18)
        {
            prioridad ++;
        }
        if (edad >= 60)
        {
            prioridad+=2;
        }
        if (enfermedad.equals("Fractura")  || enfermedad.equals("Ingesta") || enfermedad.equals("Respiratorio"))
        {
            prioridad++;
        }
        if (enfermedad.equals("Embolia") || enfermedad.equals("Infarto"))
        {
            prioridad+=2;
        }
        if (enfermedad.equals("Parto"))
        {
            prioridad+=5;
        }
        return prioridad;
    }
}
