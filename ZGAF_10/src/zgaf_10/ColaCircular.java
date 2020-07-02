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
package zgaf_10;

/**
 *
 * @author fabri
 */
public class ColaCircular {
    
    int _Frente = -1;
    int _Final = -1;
    int cola[];
    int cantidad = 0;
    
    
    //MetodosConstructores
    public ColaCircular(){
        cola = new int [100];
        cantidad = 100;
    }
    
    public ColaCircular(int cantidad){
        cola = new int [cantidad];
        this.cantidad = cantidad;
    }
    
    //Método para insertar valores
    public void Insertar(int dato)
    {
        if(Llena())
        {
            System.out.print("La Cola Está Llena \n");
        }
        else
        {
            if(_Final == cantidad - 1 && _Frente > 0)
            {
                _Final = 0;
                cola[_Final] = dato;
            }
            else
            {
                _Final++;
                cola[_Final] = dato;
                
            }
            if (_Frente == -1)
            {
                _Frente = 0;
            }
        }
    }
    
    //Método para retirar valores
    public int Retirar()
    {
        int aux = 0;
        
        if(Vacia())
        {
            System.out.print("La Cola Está Vacía \n");
        }
        
        else
        {
            cola[_Frente] = aux;
            
            if(_Frente == _Final)
            {
                _Frente = -1;
                _Final = -1;
            }
            else
            {
                _Frente++;
            }
        }
        return aux;
    }
    
    //Método para imprimir la cola
    public void Imprimir()
    {
        for(int i = 0; i < cola.length; i++)
        {
            System.out.println(cola[i]);
        }
    }
    
    //Métodos check vacía o llena
    public boolean Llena()
    {
        if(_Final + 1 == _Frente || _Final == cantidad - 1 && _Frente == 0 )
        {
            return true;
        }
        else
        {
            return false;
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
