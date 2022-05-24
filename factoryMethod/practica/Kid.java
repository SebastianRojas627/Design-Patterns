package factoryMethod.practica;

public class Kid extends Person {

    private String dateBirth;

    public Kid(String name, int ci, String dateBirth) {
        super(name, ci);
        this.dateBirth = dateBirth;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
}
