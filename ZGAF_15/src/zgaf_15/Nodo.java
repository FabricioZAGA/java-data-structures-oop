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

/**
 *
 * @author fabri
 */
public class Nodo {
    public Nodo siguiente = null;
    public Nodo anterior =  null;
    public Pelicula pelicula = new Pelicula();
    
    //Constructor
    public Nodo(int rating, String nombre)
    {
        pelicula.nombre = nombre;
        pelicula.rating = rating;

    } 
}
