package Gestion_habitat;

public class aviario extends habitats{

    public class aviario extends Gestion_habitat.habitats{
        public aviario(){ 
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

}