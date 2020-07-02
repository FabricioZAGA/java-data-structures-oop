/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zgaf_ex_3p;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ZGAF_EX_3P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda cola = new Tienda();
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a tu sistema confiable de tienditas LinaMart!\n\n-------------------------------------------------------------\n");
        while(bool)
        {
            System.out.println
                ( "Presione 1 para añadir a un nuevo producto\n"
                + "Presione 2 para ver los productos\n"
                + "Presione 9 para cerrar");
            int res = scanner.nextInt();
            System.out.println("\n");
            if(res == 1)
            {
                IngresarProductos(cola);
                System.out.println("¡Producto Añadido!\n");
            }
            if(res == 2)
            {
                try
                {
                    cola.OrdenarLista();  
                }
                catch(Exception error)
                {
                    
                }
                System.out.println("Clave\tNombre\tCosto");
                cola.ImprimirLista();
                System.out.println("\n\n");
            }
            if(res == 9)
            {
                bool = false;
            }
        }
    }
    
    
    //Método para ingresar los pacientes;
    public static void IngresarProductos(Tienda cola)
    {
        Scanner scanner = new Scanner(System.in);
        Productos producto = new Productos();
        
        System.out.println("Nombre del producto");
        producto.nombre = scanner.nextLine();
        
        System.out.println("Ingrese la clave del producto");
        producto.clave = scanner.nextInt();
       
        
        System.out.println("Precio del producto");
        producto.precio = scanner.nextDouble();
        
        
        cola.InsertarElemento(producto);
    }
    
}
