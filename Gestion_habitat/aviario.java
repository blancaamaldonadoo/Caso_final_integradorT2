package Gestion_habitat;

public class aviario extends habitats{

    boolean puede_volar;

    public class aviario extends Gestion_habitat.habitats{
        public aviario(float temperatura, float humedad, boolean limpieza, boolean puede_volar){     
            super(temperatura, humedad, limpieza);
            this.puede_volar = puede_volar;
        }
        public String toString(){ //Para que nos devuelva el array de objetos que teine terrestre
            return "aviario";
        }

        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
        protected void finalize() throws Throwable {
            super.finalize();
        }
    }

    public void setPuede_volar(boolean puede_volar) {
        this.puede_volar = puede_volar;
    }
}