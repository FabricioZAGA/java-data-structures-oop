/*
 * Universidad De La Salle Bajío.
 * Ingeniería de Software y Sistemas Computacionales
 * Programación Estructurada y Orientada a Objetos
 * Autor: Angel Fabricio Zacarías Guzmán
 * Grupo: 211   Matrícula: 67664
 * Programa: 04
 * Descripción:
 * Fecha: 0/0/2019
 */
package zgaf_04;

import java.util.Scanner;

public class ZGAF_04 {
    
    public static void main(String[] args) {
        Libro[] libroChido = new Libro[5];
        libroChido = leerLibros(libroChido);
        imprimirLibros(libroChido);
    }
    public static void imprimirLibro(Libro libroChido)
    {
        
        System.out.println(libroChido.getTitulo() + "\t" + libroChido.getAutor() + "\t" + libroChido.getEditorial() + "\t" + libroChido.getPrecio());
    
    }
    public static void imprimirLibros(Libro []libroChido)
    {
        System.out.println("Titulo\tAutor\tEditorial\tPrecio\n"); 
        for (int i = 0; i < 5; i++)
        {
        imprimirLibro(libroChido[i]);
        }
    }
    public static Libro leerLibro()
    {
        Scanner read = new Scanner(System.in);
        Libro l =  new Libro();
        System.out.print("Introduzca el titulo: ");
        l.setTitulo(read.next());
        System.out.print("Introduzca el Autor: ");
        l.setAutor(read.next());
        System.out.print("Introduzca el Editorial: ");
        l.setEditorial(read.next());
        System.out.print("Introduzca el Genero: ");
        l.setGenero(read.next());
        System.out.print("Introduzca el Edicion: ");
        l.setEdicion(read.next());
        System.out.print("Introduzca el Precio: ");
        l.setPrecio(read.nextDouble());
        System.out.print("Introduzca el FechaPublicacion: ");
        l.setFechaPublicacion(read.next());
        System.out.print("Introduzca el Número Páginas: ");
        l.setNoPag(read.nextInt());
        return l;
    }
    public static Libro [] leerLibros(Libro []libroChido)
    {
         for (int i = 0; i < 5; i++)
        {
            libroChido[i] = leerLibro();
        }
        return libroChido;
    }
    
}
