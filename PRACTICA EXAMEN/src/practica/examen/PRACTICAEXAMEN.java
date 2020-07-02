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
package practica.examen;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class PRACTICAEXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto();
        GenerarProductos(producto);
        MostrarProductos(producto);
    }
    public static void GenerarProductos(Producto producto1)
    {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Código");
        producto1.Codigo = read.nextLine();
        System.out.println("Marca");
        producto1.Marca = read.nextLine();
        System.out.println("Nombre");
        producto1.Nombre = read.nextLine();
    }
    public static void MostrarProductos(Producto producto1)
    {
        System.out.println("Codigo: " + producto1.Codigo);
        System.out.println("Marca: " + producto1.Marca);
        System.out.println("Nombre: " + producto1.Nombre);
    }
    
}
