package creational.factoryMethod.practica;

public class Person {

    private String name;
    private int ci;

    public Person(String name, int ci) {
        this.ci = ci;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
