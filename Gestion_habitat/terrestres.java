package Gestion_habitat;

public class terrestres extends habitats {

    boolean puede_caminar;

    public terrestres(float temperatura, float humedad, boolean limpieza, boolean puede_caminar) {
        super(temperatura, humedad, limpieza);
        this.puede_caminar = puede_caminar;
    }

    public boolean isPuede_caminar() {
        return puede_caminar;
    }

    public void setPuede_caminar(boolean puede_caminar) {
        this.puede_caminar = puede_caminar;
    }

    public String toString() {
        return "terrestres";
    }
    
    // Getter and Setter for puede_caminar
    public boolean getPuede_caminar() {
        return puede_caminar;
    }

    public void setPuede_caminar(boolean puede_caminar) {
        this.puede_caminar = puede_caminar;
    }
    
    // Getter and Setter for temperatura
    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    // Getter and Setter for humedad
    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    // Getter and Setter for limpieza
    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
}