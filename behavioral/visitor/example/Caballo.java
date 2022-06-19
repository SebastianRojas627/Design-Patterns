package behavioral.visitor.example;

import java.util.ArrayList;
import java.util.List;

public class Caballo implements IAnimal {

    private String name;
    private String tipo;
    private String color;
    private int edad;
    private List<String> enfermedad;

    public Caballo() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        System.out.println("-- > animal: Caballo");
        System.out.println("name: " + name);
        System.out.println("tipo: " + tipo);
        System.out.println("color:" + color);
        System.out.println("edad: " + edad);
    }

    public List<String> getEnfermedad() {
        return enfermedad;
    }
}