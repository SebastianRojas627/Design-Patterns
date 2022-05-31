package behavioral.iterator.practica;

public class Automovil {

    private int costo;
    private int nroAsientos;
    private String modelo;
    private String tipo;

    public Automovil(int costo, int nroAsientos, String modelo, String tipo) {
        this.costo = costo;
        this.nroAsientos = nroAsientos;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public int getNroAsientos() {
        return nroAsientos;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void getInfo() {

        System.out.println("\n ***AUTO REGISTRADO***");
        System.out.println("Costo: " + costo);
        System.out.println("Numero de asientos: " + nroAsientos);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
    }
}
