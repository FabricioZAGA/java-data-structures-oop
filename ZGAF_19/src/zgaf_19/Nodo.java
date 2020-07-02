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
public class Nodo {
    String Nombre;
    int Edad;
    Nodo izquierdo;
    Nodo derecho;
    
    public Nodo(int edad, String nombre)
    {
        this.Edad = edad;
        this.Nombre = nombre;
        izquierdo = null;
        derecho = null;
    }
}
