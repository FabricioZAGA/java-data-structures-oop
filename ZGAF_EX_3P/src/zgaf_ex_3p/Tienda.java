/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zgaf_ex_3p;

/**
 *
 * @author fabri
 */
public class Tienda {
    
    int _Frente = -1;
    int _Final = -1;
    int cantidad = 0;
    
    private Productos[] cola = null;
    
    public Tienda(int cantidad){
        cola = new Productos [cantidad];
        this.cantidad = cantidad;
    }
    public Tienda()
    {
        cantidad = 100;
        cola = new Productos[100];
    }
    public void InsertarElemento(Productos producto)
    {
        if(Llena())
        {
            System.out.print("Se llenó el inventario\n");
        }
        else
        {
            _Final++;
            cola[_Final] = producto;    
        }
    }
    
    
    public void OrdenarLista()
    {
        
        for (int i = 0; i < cola.length; i++) 
        {
            Productos aux = cola[i];
            int j;
            for (j = i - 1; j >= 0 && cola[j].clave > aux.clave; j--)
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
                System.out.println(cola[i].clave + "\t" + cola[i].nombre + "\t" + cola[i].precio);
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
    
}
