package Animales;

public class animal_terrestre {

    boolean patas;
    boolean cola;
    boolean pelo;
    boolean tipo_terrestre;
    
}

public animal_terrestre(boolean patas, boolean cola, boolean pelo, boolean tipo_terrestre, String nombre, String especie, int id, boolean salud, boolean comportamiento, boolean alimentacion) {
    super(nombre, especie, id, salud, comportamiento, alimentacion);
    this.patas = patas;
    this.cola = cola;
    this.pelo = pelo;
    this.tipo_terrestre = tipo_terrestre;
}
