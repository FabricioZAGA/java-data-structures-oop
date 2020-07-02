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
package zgaf_pr1_2p;

/**
 *
 * @author fabri
 */
public class Cola {
    int _Frente = -1;
    int _Final = -1;
    int cantidad = 0;
    
    private Paciente[] cola = null;
    
    public Cola(int cantidad){
        cola = new Paciente [cantidad];
        this.cantidad = cantidad;
    }
    public Cola()
    {
        cantidad = 100;
        cola = new Paciente[100];
    }
    public void InsertarElemento(Paciente paciente)
    {
        if(Llena())
        {
            System.out.print("La sala está llena, esto es el IMSS \n");
        }
        else
        {
            _Final++;
            cola[_Final] = paciente;    
        }
    }
    
    
    
    public void ExtraerElemento()
    {
        if(!Vacia())
        {
            _Final++;
            System.out.println(cola[++_Frente].nombre + " ha sido atendido\n");
        }
        else
        {
           System.out.println("No hay nadie en la fila de espera\n"); 
        }
        
    }
    
    
    public void OrdenarLista()
    {
        
        for (int i = 0; i < cola.length; i++) 
        {
            Paciente aux = cola[i];
            int j;
            for (j = i - 1; j >= 0 && cola[j].prioridad < aux.prioridad; j--)
            {
                cola[j + 1] = cola[j];
            }
            cola[j + 1] = aux;
        }
    }
    public void ImprimirLista()
    {
        if (!Vacia())
        {
            for (int i = _Frente + 1; i <= _Final; i++)
            {
                System.out.println(cola[i].nombre + "\t" + cola[i].enfermedad + "\t" + cola[i].edad + "\t" + cola[i].prioridad);
                //System.out.print(cola[i] + "\n");
            }
        }
    }
    
    //Métodos check vacía o llena
    public boolean Llena()
    {
        if (_Final == cantidad)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    private boolean Vacia()
    {
        if(_Frente == -1 && _Final == -1)
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
