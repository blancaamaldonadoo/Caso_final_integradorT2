package Animales;

public class animal_acuatico extends animales{

    boolean aletas;
    boolean branquias,
    boolean escamas;
    String tipo_agua;

    public animal_acuatico(String nombre, String especie, int id, boolean aletas, boolean branquias, boolean escamas, String tipo_agua){
        super(nombre, especie, id);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipo_agua = tipo_agua;
    }
    
}