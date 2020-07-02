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

/**
 *
 * @author fabri
 */
public class PedidoAltias {
    public int noOrden;
    public int cantidad;
    public String tipoAlitas;
    public String salsa;
    private double precio;
    
    //Método Constructor
    public PedidoAltias()
    {
        
    }
    public PedidoAltias(int noOrden)
    {
        this.noOrden = noOrden;
    }
    //Métodos
    public void establecerPrecio()
    {
        if (tipoAlitas ==  "Clasicas")
        {
            this.precio = 6;
        }
        else if (tipoAlitas == "Boneless")
        {
            this.precio = 8;
        }
        if (salsa == "Especial") {
            this.precio += 2;
        }
    }
    public double calcularTotal()
    {
        return (cantidad*precio);
    }
    
    public double getPrecio()
    {
        return (precio);
    }
}
