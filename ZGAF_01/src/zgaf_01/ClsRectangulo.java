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
package zgaf_01;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ClsRectangulo {
    public int ancho;
    public int alto;
    public int perimetro;
    public int area;
    public int dividir;
    public int potencia;
    
        public ClsRectangulo()
    {
        
    }
    
    public ClsRectangulo(int alto, int ancho)
    {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void dibujar()
    {
        for (int i = 0; i < alto; i++)
        {
            for (int j = 0; j < ancho; j++)
            {
                System.out.print(" :v ");
            }
            System.out.println();
        } 
    }
    public void generarPerimetro()
    {
        perimetro = 2 * ancho + 2 * alto;
        System.out.println("Perímetro = " + perimetro);
    }
    public void generarArea()
    {
        area = ancho * alto;
        System.out.println("Area = " + area);
    }
}
