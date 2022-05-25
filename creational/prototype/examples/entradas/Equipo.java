package creational.prototype.examples.entradas;

public class Equipo {
    private String nombre;
    private int nroIntegrantes;
    private String ranking;

    public Equipo(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroIntegrantes() {
        return nroIntegrantes;
    }

    public void setNroIntegrantes(int nroIntegrantes) {
        this.nroIntegrantes = nroIntegrantes;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
