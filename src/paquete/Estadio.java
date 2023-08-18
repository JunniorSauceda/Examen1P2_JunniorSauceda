/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author Junnior Sauceda
 */
public class Estadio {
    private String nombre,ciudad;
    private int capacidad;
    private Equipo dueño=new Equipo();

    public Estadio(String nombre, String ciudad, int capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }

    public Estadio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Equipo getDueño() {
        return dueño;
    }

    public void setDueño(Equipo dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Estadio " + nombre + " en " + ciudad + " pertenece a " + dueño ;
    }
    
}
