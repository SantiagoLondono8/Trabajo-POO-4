/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.*;

/**
 *
 * @author santi
 */
public class ListaPersonas {

    Vector listaPersonas;

    public ListaPersonas() {
        listaPersonas = new Vector(); // Crea el vector de personas
    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    /**
     * Método que permite eliminar una persona del vector de personas
     *
     * @param i Parámetro que define la posición a eliminar en el vector de
     * personas
     */
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }

    /**
     * Método que permite eliminar todos los elementos del vector de personas
     */
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}
