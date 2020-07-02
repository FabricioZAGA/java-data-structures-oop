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
package zgaf_03;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ZGAF_03 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        PedidoAltias pedido = new PedidoAltias(1);
        pedido.cantidad = 200;
        pedido.tipoAlitas = "Clasicas";
        pedido.salsa = "Especial";
        pedido.establecerPrecio();
        System.out.println("Total = " + pedido.calcularTotal());
    }
    
}
