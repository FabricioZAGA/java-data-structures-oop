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
package zgaf_08;

/**
 *
 * @author fabri
 */
public class ZGAF_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(OperacionPosfija("123-+"));
    }
    public static double OperacionPosfija(String cadena)
    {
        Pila pila = new Pila();
        double value1, value2;
        double res = 0;
        
        int i = 0;
        while (cadena!= null)
        {
            if (Character.isDigit(cadena.charAt(i)))
            {
                pila.Push(Integer.parseInt(cadena.charAt(i)+""));
            }
            else 
            {
                value2 = Integer.parseInt(pila.Pop());
                value1 = Integer.parseInt(pila.Pop());
                char op = cadena.charAt(i);
                if(op == '+')
                {
                    res = value1 + value2;
                }
                if(op == '-')
                {
                    res = value1 - value2;
                }
                if(op == '*')
                {
                    res = value1 * value2;
                }
                if(op == '/')
                {
                    res = value1 / value2;
                }
                pila.Push(res);
            }
            i++;
        }
        return res;
    }
}
