/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author mario
 */
public class Arbol {
       Pelicula Peli;
    Pelicula[] cinema;
    
    public Arbol(int tamanio)
    {
        cinema = new Pelicula[tamanio + 1];
    }
    
    public void Raiz(Pelicula pelicula)
    {
        cinema[0] = pelicula;
    }
    public void setIzquierda(Pelicula key, int Peli)
    {
        int t = Peli*2 + 1;
        
        if(cinema[Peli] == null)
        {
            System.out.print("No se puede  k sad");
        }
        else
            cinema[t] = key;
    }
    public void setDerecha(Pelicula key, int Peli)
    {
        int t = Peli*2 + 2;
        
        if(cinema[Peli] == null)
        {
            System.out.print("No se puede k sad");
        }
        else
            cinema[t] = key;
    }
    public void Imprimir()
    {
        System.out.println("Se Imprime");
        System.out.print("\n");

        for(int i = 0; i < cinema.length; i++)
        {
            if(cinema[i] != null)
                System.out.println("Pelicula: " + cinema[i].getPelicula() + "\n" +
                        "Rating: " + cinema[i].getRating());
            else
                System.out.print("-");
        }
    }
    
    public void preOrder(int index) 
    {
        try
        {
            if (index >= cinema.length) 
            {
                return;
            }
            System.out.println("Pelicula: " + cinema[index].getPelicula() + "\n" +
                            "Rating: " + cinema[index].getRating());
            preOrder((2 * index)+1);
            preOrder((2 * index)+2);
        }
        catch(Exception e){}
        
    }
    
    public void inOrder(int index) 
    {
        try
        {
            if (index >= cinema.length) 
            {
                return;
            }
            inOrder((2 * index)+1);
            System.out.println("Pelicula: " + cinema[index].getPelicula() + "\n" +
                            "Rating: " + cinema[index].getRating());
            inOrder((2 * index)+2);
        }
        catch(Exception e){}
    }
    
    public void PostOrder(int index) 
    { 
        try
        {
            if (index >= cinema.length) 
            {
                return;
            }
            PostOrder((2 * index)+1);
            System.out.println("Pelicula: " + cinema[index].getPelicula() + "\n" +
                            "Rating: " + cinema[index].getRating());
            PostOrder((2 * index)+2);
        }
        catch(Exception e){}
    }   
}


