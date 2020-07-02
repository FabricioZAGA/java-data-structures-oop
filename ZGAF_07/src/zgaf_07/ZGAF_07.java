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
package zgaf_07;

/**
 *
 * @author fabri
 */
public class ZGAF_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public boolean Check(String cadena) {
    	Pila pila = new Pila ();    
    	for (int i = 0 ; i < cadena.length() ; i++)
    	{
    	    if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') 
            {
    	    	pila.Push(cadena.charAt(i));
    	    } else 
            {
    	    	if (cadena.charAt(i)==')')
                {
    	    	    if (pila.Pop()!='(') 
                    {
    	    	        return false;
    	    	    }
    	     	} 
                else 
                {
    	    	    if (cadena.charAt(i)==']')
                    {
    	    	        if (pila.Pop()!='[') 
                        {
    	    	            return false;
    	    	        }
    	    	    } 
                    else 
                    {
    	    	        if (cadena.charAt(i)=='}') 
                        {
    	    	            if (pila.Pop()!='{')
                            {
    	    	                return false;
    	    	            }
    	    	        }
    	    	    }
    	        }
   	    }   
        }
    	if (pila.Verificar())
        {
    	    return true;
    	} 
        else 
        {
   	    return false;
    	}
    }	
}
