/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author santi
 */
public class Persona {

    String nombre; // Atributo que identifica el nombre de una persona
    String apellidos;
    /* Atributo que identifica los apellidos de una
persona */
    String teléfono; // Atributo que identifica el teléfono de una persona
    String dirección;

    public Persona(String nombre, String apellidos, String teléfono,
            String dirección) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.teléfono = teléfono;
        this.dirección = dirección;
    }
}
