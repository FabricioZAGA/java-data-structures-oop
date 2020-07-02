
import java.util.Scanner;

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

public class main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int j;
      int[] calificaciones = null;
      int nAlumnos = scanner.nextInt();
      calificaciones = new int[nAlumnos];
      for (int a = 0; a < calificaciones.length; a++)
      {
          calificaciones[a] = scanner.nextInt();
      }
      for (int i = 1; i < calificaciones.length; i++)
      {
         int aux = calificaciones[i];
         for (j = i - 1; (j >= 0) && calificaciones[j] > aux; j--)
         {
              calificaciones[j+1] = calificaciones[j];
         }
         calificaciones[ j + 1] = aux;
      }
      for (int a : calificaciones) 
     { 
       System.out.print(a);
     }
   }    
}

