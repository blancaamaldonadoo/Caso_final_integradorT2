package Gestion_habitat

public class habitats{

    float temperatura;
    float humedad;
    boolean limpieza;

    public habitats(float temperatura, float humedad, boolean limpieza){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

//Encapsular: 

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }


@Override
public String toString(){
    return
}

}