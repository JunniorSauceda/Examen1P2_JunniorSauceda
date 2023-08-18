/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.ArrayList;

/**
 *
 * @author Junnior Sauceda
 */
public class Equipo {

    private String Nombre, pais;
    private int rating;
    private ArrayList<Jugador> plantilla = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String Nombre, String pais) {
        this.Nombre = Nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {
        int acum = 0;
        if (plantilla.isEmpty()) {
            this.rating=0;
        } else {
            for (Jugador jugador : plantilla) {
                acum += jugador.getRating();
            }
            this.rating = acum / plantilla.size();
        }
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        if (plantilla.size() > 4) {

        } else {
            this.plantilla = plantilla;
        }
    }

    @Override
    public String toString() {
        return Nombre + " - " + pais;
    }

}
