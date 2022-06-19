package behavioral.visitor.example;

import java.util.ArrayList;
import java.util.List;

public class Perro implements IAnimal {

    private String name;
    private String raza;
    private String color;
    private int edad;
    private List<String> enfermedad;

    public Perro() {
        enfermedad = new ArrayList<>();
    }

    @Override
    public void accept(IMedico visitor) {
        visitor.recetaTratamiento(this);
    }

    @Override
    public void setEnfermedad(String enfermedad) {
        this.enfermedad.add(enfermedad);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void showInfo() {
        System.out.println("-- > animal: Perro");
        System.out.println("name: " + name);
        System.out.println("raza: " + raza);
        System.out.println("color:" + color);
        System.out.println("edad: " + edad);
    }

    public List<String> getEnfermedad() {
        return enfermedad;
    }
}