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
package zgaf_bicola_entrada_restringida;

/**
 *
 * @author fabri
 */
public class ZGAF_BICOLA_ENTRADA_RESTRINGIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.Insertar(1);
        cola.Insertar(2);
        cola.Insertar(3);
        cola.Retirar();
        cola.Retirar();
        cola.Imprimir();
    }
    
}
