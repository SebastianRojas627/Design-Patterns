package behavioral.memento.practica;

public class Persona {

    private String name;
    private String ci;
    private int edad;

    public Persona(String name, String ci, int edad) {
        this.name = name;
        this.ci = ci;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public String getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    public void info() {
        System.out.println("\n PERSONA:");
        System.out.println("Nombre: " + getName() + ", CI: " + getCi() + ", edad: " + getEdad());
    }
}
