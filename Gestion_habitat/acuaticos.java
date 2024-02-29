package Gestion_habitat;
public class acuaticos extends habitats{

    boolean puede_nadar;

    public acuaticos(float temperatura, float humedad, boolean limpieza, boolean puede_nadar){
        super(temperatura, humedad, limpieza);
        this.puede_nadar = puede_nadar;
    }
    public String toString(){ //Para que nos devuelva el array de objetos que teine terrestre
        return "acuaticos";
    }

    public void setPuede_volar(boolean puede_nadar) {
        this.puede_nadar = puede_nadar;
    }
}