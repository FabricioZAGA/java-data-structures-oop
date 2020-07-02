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
package zgaf_02;

/**
 *
 * @author fabri
 */
public class ClsCalculadora {
    public double valor1, valor2;
    public double res;
    
    public ClsCalculadora(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public void sumar(){
        res = valor1 + valor2;
        System.out.println("La suma de los valores es: " +  res);
    }
    public void restar(){
        res = valor1 - valor2;
        System.out.println("La resta de los valores es: " +  res);
    }
    public void multiplicar(){
        res = valor1 * valor2;
        System.out.println("La multiplicacion de los valores es: " +  res);
    }
    public void dividir(){
        res = valor1 / valor2;
        System.out.println("La división de los valores es: " +  res);
    }
    public void potenciar(){
        double base = valor1;
        for (int i = 1; i < valor2; i++)
        {
            valor1 = valor1 * base;
        }
        res = valor1;
        System.out.println("La resta de los valores es: " +  res);
    }
}
