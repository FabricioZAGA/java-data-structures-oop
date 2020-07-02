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
public class Validacion {
    private char P[];
    private int Tope;
    //Constructores
    public Validacion(){
        P = new char [100];
        Tope = -1;
    }
    
    public Validacion(int a)
    {
        P = new char [a];
        Tope = -1;
    }
    
    // Métodos
    public char Push(char e)
    {
        if (Tope < e)
        {
            P[++Tope] = e;
            return Validar();
        }
        else {
            return Validar();
        }
    }
    
    public char Pop()
    {
        if (Tope > -1)
        {
            return (P[Tope--]);
        }
        else
        {
            return Validar();
        }
    }
    public char Validar()
    {
        if (Tope == -1){
            return ('#');
        }
        return ('!');
    }
}
