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
package zgaf_omega_1;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ZGAF_OMEGA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int importe = scanner.nextInt();
        if (importe < 100000)
        {
            int [] monedas={1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int [] devolver={0,0,0,0,0,0,0,0,0,0};
 
        for(int i=0;i<monedas.length;i++)
        {
            if(importe>=monedas[i])
            {
                devolver[i]=(int) Math.floor(importe/monedas[i]);
                importe=importe-(devolver[i]*monedas[i]);
            }
        }
 
        
        for(int i = 0; i < monedas.length; i++)
        {
            if(devolver[i] > 0)
            {
                if(monedas[i]>2)
                {
                    System.out.println(devolver[i] + " billete(s) de " + monedas[i]);
                }
                else
                {
                   
                    System.out.println(devolver[i] + " moneda(s) de " + monedas[i]);
                }
            }
        }
      }
        
    }    
    public static void Omega1()
    {
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
        for (int b = calificaciones.length - 1; b >= 0; b--)
        {
            System.out.println(calificaciones[b]);
        }
        
    }
    public static void Omega2()
    {
        Scanner scanner = new Scanner (System.in);
        String normal = scanner.nextLine();
        String invertida = "";
        for (int i = normal.length() - 1; i >= 0; i --)
        {
            invertida += normal.charAt(i);
        }
        System.out.print(invertida);
    }
    public static void Omega3()
    {
        char[] caracteres;
    	Scanner scanner = new Scanner(System.in);
        caracteres = scanner.nextLine().toUpperCase().toCharArray();
        int valores = 0;
        int i = 0, j = 0;
        for(i= 0; i < caracteres.length; i++)
        	valores += caracteres[i];
        
        for(i = valores; i > 0; i--)
        {
        	if(valores % i == 0)
        	{
        		j++;
        	}
        }
    	System.out.println(j);
    }
    public static void Omega4()
    {
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        int numero = scanner.nextInt();
        int yes = 0;
        int[] aNumeros = new int[cantidad];
        for (int i = 0; i < aNumeros.length; i++)
        {
            aNumeros[i] = scanner.nextInt();
            if(aNumeros[i] == numero)
            {
                yes++;
            }
        }
        System.out.println(yes);
    }
}
