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
public class Defensa extends Jugador{
    Random ran = new Random();
    public Defensa() {
    }

    public Defensa(String Nombre, String nacionalidad, String pieHabil, int edad,Equipo equipo) {
        super(Nombre, nacionalidad, pieHabil, edad,equipo);
    
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
        rating= (Agarre+Físico+Disparo+Entrada+Lanzamiento+Passing+Regate+Ritmo+Visión)/9;
    }

    @Override
    public void setAgarre() {
        int num=0;
        while(num>100){
            num=((ran.nextInt(5))*13);
        }
        Agarre=num;
    }


    @Override
    public void setFísico() {
        int num=0;
        while(num<70||num>100){
            num=((ran.nextInt(12))*12);
        }
        Físico=num;
    }

    @Override
    public void setRitmo() {
        int num=0;
        while(num<70||num>100){
            num=((ran.nextInt(12))*12);
        }
        Ritmo=num;
    }

    @Override
    public void setEntrada() {
        int num=0;
        while(num<70||num>100){
            num=((ran.nextInt(12))*12);
        }
        Entrada=num;
    }

    @Override
    public void setVisión() {
        int num=0;
        while(num>100){
            num=((ran.nextInt(5))*13);
        }
        Visión=num;
    }

    @Override
    public void setPassing() {
        int num=0;
        while(num>100){
            num=((ran.nextInt(5))*13);
        }
        Passing=num;
    }

    @Override
    public void setRegate() {
        int num=0;
        while(num>100){
            num=((ran.nextInt(5))*13);
        }
        Regate=num;
    }

    @Override
    public void setDisparo() {
        int num=0;
        while(num>100){
            num=((ran.nextInt(5))*13);
        }
        Disparo=num;
    }

    @Override
    public void setLanzamiento() {
        int num=0;
        while(num>100){
            num=((ran.nextInt(5))*13);
        }
        Lanzamiento=num;
    }
}
