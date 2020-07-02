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
package zgaf_15;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ZGAF_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        Menu(lista);
        
    }
    
    public static void Menu(Lista lista)
    {
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a tu sistema confiable de películas piratas!\n\n-------------------------------------------------------------\n");
        while(bool)
        {
            System.out.println
                ( "Presione 1 para añadir a una nueva pelicula\n"
                + "Presione 2 para ver las peliculas\n"
                + "Presione 3 para eliminar la película más chafa\n"
                + "Presione 9 para cerrar");
            int res = scanner.nextInt();
            System.out.println("\n");
            if(res == 1)
            {
                IngresarPeliculas(lista);
                System.out.println("¡Pelicula Añadida!\n");
            }
            if(res == 2)
            {
                System.out.println("Nombre\t\tRating");
                lista.ImprimirLista();
                System.out.println("\n\n");
            }
            if(res == 3)
            {

                lista.ExtraerElemento();
            }
            if(res == 9)
            {
                bool = false;
            }
        }
    }
    
    public static void IngresarPeliculas(Lista lista)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nombre de la pelicula");
        String nombre = scanner.nextLine();
        
        System.out.println("Rating");
        int rating = scanner.nextInt();
        
        
        lista.InsertarElemento(nombre, rating);
    }
    
   
}
