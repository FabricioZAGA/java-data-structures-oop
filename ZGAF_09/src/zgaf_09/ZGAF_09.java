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
package zgaf_09;

/**
 *
 * @author fabri
 */
public class ZGAF_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        _Cola cola = new _Cola(3);
        cola.insertar(5);
        cola.insertar(10);
        cola.insertar(2);
        cola.consultar();
    }
    
}
