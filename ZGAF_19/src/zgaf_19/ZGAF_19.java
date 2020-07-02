/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zgaf_19;

/**
 *
 * @author fabri
 */
public class ZGAF_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.Insertar(123, "Juan");
        arbol.Insertar(12, "Luis");
        arbol.Insertar(31, "Hugo");
        arbol.Insertar(1, "Chafa");
        arbol.Insertar(4, "Juan2");
        arbol.Insertar(56, "Luis2");
        arbol.Insertar(84, "Hugo2");
        arbol.Insertar(34, "Chafa2");
        arbol.InOrden(arbol.Raiz);
        System.out.println("\n\n\n");
        arbol.Eliminar(arbol.Raiz, 4);
        arbol.InOrden(arbol.Raiz);
    }
    
}
