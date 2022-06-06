package behavioral.chainResponsibility.practica;

public class Persona {

    public int ci;
    public int edad;
    public String nombre;

    public Persona(int ci, String nombre, int edad) {

        this.ci = ci;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

}
