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
package zgaf_bicola_entrada_restringida;

/**
 *
 * @author fabri
 */
public class Cola {
    int _Frente = -1;
    int _Final = -1;
    int cola[];
    int cantidad = 0;
    boolean Frente = true;
    
    public Cola()
    {
        cola = new int[100];
        cantidad = 100;
    }
    
    public Cola(int cantidad)
    {
        cola = new int[cantidad];
        this.cantidad = cantidad;
    }
    
    public void Insertar(int dato)
    {
        if (Llena())
        {
            System.out.print("La Cola Está Llena \n");
        }

        else 
        {
            if(Vacia())
        {
            _Frente++;
        }
            _Final++;
            cola[_Final] = dato;
        }
    }
    
    public int Retirar()
    {
        int aux = 0;
        
        if(Vacia())
        {
            System.out.print("La Cola Está Vacía \n");
        }
        
        else
        {
            if (Frente)
            {
               cola[_Frente] = aux;
               _Frente--;
               Frente = false;
            }
            else
            {
                cola[_Final] = aux;
                _Final++;
                Frente = true;
            }
        }
        return aux;
    }
    
    public boolean Llena()
    {
        if (_Final == cantidad - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void Imprimir()
    {
        for(int i = 0; i < cola.length; i++)
        {
            System.out.println(cola[i]);
        }
    }
    
    public boolean Vacia()
    {
        if(_Final==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
