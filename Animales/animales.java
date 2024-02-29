package Animales;

public class animales{

    String nombre;
    String especie;
    int id;
    boolean salud;
    boolean comportamiento;
    boolean alimentacion;
    

    public animales(String nombre, String especie, int id){
        this.nombre = nombre;
        this.especie = especie;
        this.id = id;
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

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
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

    public void buenasalud(boolean salud){
        if (salud == true)
        System.out.println("El animal " + nombre + " se encuentra en buen estado de salud");
        else System.out.println("El animal " + nombre + " se encuentra en mal estado de salud");
    }

    public void buencomportamiento(boolean comportamiento){
        if (comportamiento == true)
        System.out.println("El animal " + nombre + " se comporta de manera adecuada");
        else System.out.println("El animal " + nombre + " se comporta de manera inadecuada");
    }   

    //metodo para resgistrar el nombre
    public void registrarNombre(String nombre){
        System.out.println("El nombre del animal es " + nombre);
    }
    
    //metodo para resgistrar la alimentacion
    public void registrarAlimentacion(String alimentacion){
        System.out.println("El animal " + nombre + " se alimenta de " + alimentacion);
    }

    //metodo para resgistrar la reproduccion
    public void registrarReproduccion(String reproduccion){
        System.out.println("El animal " + nombre + " se reproduce por " + reproduccion);
    }

    //metodo para resgistrar los cuidados
    public void registrarCuidados(String cuidados){
        System.out.println("El animal " + nombre + " necesita " + cuidados);
    }

    //metodo para resgistrar las enfermedades
    public void registrarEnfermedades(String enfermedades){
        System.out.println("El animal " + nombre + " puede sufrir de " + enfermedades);
    }

    //metodo para resgistrar las vacunas
    public void registrarVacunas(String vacunas){
        System.out.println("El animal " + nombre + " necesita vacunarse de " + vacunas);
    }
    
    //metodo para resgistrar el habitat
    public void registrarHabitat(String habitat){
        System.out.println("El animal " + nombre + " vive en " + habitat);
    }

    //metodo para resgistrar el comportamiento
    public void registrarComportamiento(boolean comportamiento){
    System.out.println("El animal " + nombre + " se comporta de manera " + buencomportamiento(comportamiento));}

    //metodo para resgistrar la salud   
    public void registrarSalud(boolean salud){
        System.out.println("El animal " + nombre + " se encuentra en " + buenasalud(salud));
    }





}