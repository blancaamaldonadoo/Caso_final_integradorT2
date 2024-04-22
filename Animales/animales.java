package Animales;

import Gestion_habitat.Habitat;

public class animales{

    private String nombre;
    private String especie;
    private boolean salud;
    private boolean comportamiento;
    private Habitat habitat;

    public animales(String nombre, String especie, boolean salud, boolean comportamiento, Habitat habitat){
        this.nombre = nombre;
        this.especie = especie;
        this.salud = salud;
        this.comportamiento = comportamiento;
        this.habitat = habitat;
    }

    public animales(String nombre, String especie, boolean salud, boolean comportamiento, String habitat){
    }

    //GETTERS Y SETTERS:
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public boolean getSalud(){
        return salud;
    }      

    public void setSalud(boolean salud){
        this.salud = salud;
    }

    public boolean getComportamiento(){
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento){
        this.comportamiento = comportamiento;
    }


    public Habitat getHabitat(){
        return habitat;
    }

    public void setHabitat(Habitat habitat){
        this.habitat = habitat;
    }

}