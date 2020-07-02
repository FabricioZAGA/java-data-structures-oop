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

/**
 *
 * @author fabri
 */
public class ZGAF_06
{
      

  public static void main (String [] pps) {

  }

  public static String Verificar (String carac) 
  {
      boolean verificacion = false;
      Validacion pila = new Validacion();  
      for (int i = 0; i < carac.length(); i++)
      {
	  if (carac.charAt(i) == '(')
          {
              if (pila.Push('(') == '#')
              {
                  verificacion = true; 
              }
          }  
              else if (carac.charAt(i) == '('){
              if (pila.Pop() == '#')
              {
                  verificacion = true; 
              }
              }
      }

        if (verificacion == true){
             return "La cadena no está balanceada";
      }
      else {
            return "La cadena está balanceada";
      }
  }
}