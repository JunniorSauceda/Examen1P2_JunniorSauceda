/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author Junnior Sauceda
 */
public abstract class Jugador {
    private String Nombre, nacionalidad,pieHabil;
    private int edad;
    private Equipo equipo=new Equipo();
    protected int Agarre, Lanzamiento, Físico, Ritmo, Entrada,Visión, Passing, Regate , Disparo,rating ;

    public Jugador() {
    }

    public Jugador(String Nombre, String nacionalidad, String pieHabil, int edad) {
        this.Nombre = Nombre;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.edad = edad;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public  void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public  void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getEdad() {
        return edad;
    }

    public  void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRating() {
        return rating;
    }

    public abstract void setRating();

    public Equipo getEquipo() {
        return equipo;
    }

    public  void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return Agarre;
    }

    public abstract void setAgarre();

    public int getLanzamiento() {
        return Lanzamiento;
    }

    public abstract void setLanzamiento();

    public int getFísico() {
        return Físico;
    }

    public abstract void setFísico();

    public int getRitmo() {
        return Ritmo;
    }

    public abstract void setRitmo();

    public int getEntrada() {
        return Entrada;
    }

    public abstract void setEntrada();

    public int getVisión() {
        return Visión;
    }

    public abstract void setVisión();

    public int getPassing() {
        return Passing;
    }

    public abstract void setPassing();

    public int getRegate() {
        return Regate;
    }

    public abstract void setRegate() ;

    public int getDisparo() {
        return Disparo;
    }

    public abstract void setDisparo();

    @Override
    public String toString() {
        return "Nombre: " + Nombre + " Nacionalidad: " + nacionalidad + " Pie Habil: " + pieHabil +
                " Edad: " + edad + " Equipo: " + equipo;
    }
    
    
}
