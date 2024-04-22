package Animales;

public class animal_aviario extends animales{

    boolean vuela;
    boolean pico;
    boolean plumaje;
    boolean tipo_aviario;
    
    public animal_aviario(boolean vuela, boolean pico, boolean plumaje, boolean tipo_aviario, String nombre, String especie, int id, boolean salud, boolean comportamiento, boolean alimentacion) {
        super(nombre, "Aviario", id, salud, comportamiento);    
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
        this.tipo_aviario = tipo_aviario;
    }
} 
