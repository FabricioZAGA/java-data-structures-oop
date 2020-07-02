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
package zgaf_19;

/**
 *
 * @author fabri
 */
public class Arbol {
    
    Nodo Raiz;
    
    
    public Arbol()
    {
        Raiz = null;
    }
    public void Insertar (int edad, String nombre)
    {
        Nodo nuevo = new Nodo(edad, nombre);
        
        //Si el nodo raiz es vacío
        if(Vacio())
        {
            //La raiz es igual al nodo nuevo a insertar
            Raiz = nuevo;
        }
        else
        {
            Nodo anterior = null;
            Nodo aux = Raiz;
            
            //Ciclo while con nodo auxiliar para la busqueda del nodo a insertar
            while(aux != null)
            {
                //Se liga el nodo anterior al nodo auxiliar para insersión de nuevo nodo
                anterior = aux;
                //Edad menor a insertar se va al lado izquierdo del árbol
                if (edad <= aux.Edad)
                {
                    aux = aux.izquierdo;
                }
                else
                {
                    aux = aux.derecho;
                }
            }
            
            //Validacion igual a la del ciclo while para insertar datos
            //Se utiliza el nodo anterior encontrado previamente en el ciclo While
            if(edad <= anterior.Edad)
            {
                anterior.izquierdo = nuevo;
            }
            else
            {
                anterior.derecho = nuevo;
            }
        } 
    }
    
    
    //Funcion ordenamiento PreOrden
    public void PreOrden(Nodo raiz)
    {
        if(raiz != null)
        {
            System.out.println(raiz.Nombre + " tiene: "  + raiz.Edad + " años.");
            PreOrden(raiz.izquierdo);
            PreOrden(raiz.derecho);
        }
    }
    
    
    //Funcion ordenamiento InOrden
    public void InOrden(Nodo raiz)
    {
        if (raiz != null)
        {
            InOrden(raiz.izquierdo);
            System.out.println(raiz.Nombre + " tiene: "  + raiz.Edad + " años.");
            InOrden(raiz.derecho);
        }
    }
    
    
    //Funcion ordenamiento PostOrden
    public void PostOrden(Nodo raiz)
    {
        if(raiz != null)
        {
            PostOrden(raiz.izquierdo);
            PostOrden(raiz.derecho);
            System.out.println(raiz.Nombre + " tiene: "  + raiz.Edad + " años.");
        }
    }
    
    //Método para eliminar
   
    
    
    //Funcion para verificar si el arbol está vacío
    public boolean Vacio()
    {
        if(Raiz ==  null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    //Método para eliminar nodos    
    public Nodo Eliminar(Nodo raiz, int e) 
    { 
        //Verifica si el arbol está vacío
        if (Vacio()) 
        {
            System.out.println("El árbol está vacío");
            return raiz;
        } 
  
        if (e < raiz.Edad) 
        {
           raiz.izquierdo = Eliminar(raiz.izquierdo, e); 
        }
             
        else if (e > raiz.Edad) 
        {
            raiz.derecho = Eliminar(raiz.derecho, e); 
        }
        else
        { 
            // Raices sin hijo izquierdo
            if (raiz.izquierdo == null)
            {
                return raiz.derecho; 
            } 
            // Raices sin hijo derecho
            else if (raiz.derecho == null)
            {
                return raiz.izquierdo; 
            } 
            // Elimina el sucesor;
            raiz.derecho = Eliminar(raiz.derecho, raiz.Edad); 
        } 
        return raiz; 
    } 
    
}
