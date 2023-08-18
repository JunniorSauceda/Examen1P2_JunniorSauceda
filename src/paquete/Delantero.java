/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Random;

/**
 *
 * @author Junnior Sauceda
 */
public class Delantero extends Jugador {

    Random ran = new Random();

    public Delantero() {
        super();
    }

    public Delantero(String Nombre, String nacionalidad, String pieHabil, int edad) {
        super(Nombre, nacionalidad, pieHabil, edad);
        setAgarre();
        setDisparo();
        setEntrada();
        setFísico();
        setLanzamiento();
        setPassing();
        setRegate();
        setRitmo();
        setVisión();
        setRating();
    }

    @Override
    public void setRating() {
        rating = (Agarre + Físico + Disparo + Entrada + Lanzamiento + Passing + Regate + Ritmo + Visión) / 9;
    }

    @Override
    public void setAgarre() {
        int num = 0;
        while (num > 100) {
            num = ((ran.nextInt(5)) * 13);
        }
        Agarre = num;
    }

    @Override
    public void setFísico() {
        int num = 0;
        while (num > 100) {
            num = ((ran.nextInt(5)) * 13);
        }
        Físico = num;
    }

    @Override
    public void setRitmo() {
        int num = 0;
        while (num < 70 || num > 100) {
            num = ((ran.nextInt(12)) * 12);
        }
        Ritmo = num;
    }

    @Override
    public void setEntrada() {
        int num = 0;
        while (num > 100) {
            num = ((ran.nextInt(5)) * 13);
        }
        Entrada = num;
    }

    @Override
    public void setVisión() {
        int num = 0;
        while (num > 100) {
            num = ((ran.nextInt(5)) * 13);
        }
        Visión = num;
    }

    @Override
    public void setPassing() {
        int num = 0;
        while (num > 100) {
            num = ((ran.nextInt(5)) * 13);
        }
        Passing = num;
    }

    @Override
    public void setRegate() {
        int num = 0;
        while (num < 70 || num > 100) {
            num = ((ran.nextInt(12)) * 12);
        }
        Regate = num;
    }

    @Override
    public void setDisparo() {
        int num = 0;
        while (num < 70 || num > 100) {
            num = ((ran.nextInt(12)) * 12);
        }
        Disparo = num;
    }

    @Override
    public void setLanzamiento() {
        int num = 0;
        while (num > 100) {
            num = ((ran.nextInt(5)) * 13);
        }
        Lanzamiento = num;
    }

}
