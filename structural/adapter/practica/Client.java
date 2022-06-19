package structural.adapter.practica;

public class Client {

    public static void main(String[] args) {

        Artefactos1 a1 = new Celular(900, "4 años");
        Artefactos1 a2 = new Tablet(600, "2 años");
        Artefactos1 a3 = new Computadora(1500, "6 años");

        Artefactos1 a4 = new Adapter(new Televisor(1800, "3 años"));
        Artefactos1 a5 = new Adapter(new Lavadora(2600, "10 años"));
        Artefactos1 a6 = new Adapter(new Refrigerador(2200, "8 años"));

        a1.getPrecio();
        a1.getTiempoVida();
        a2.getPrecio();
        a2.getTiempoVida();
        a3.getPrecio();
        a3.getTiempoVida();
        a4.getPrecio();
        a4.getTiempoVida();
        a5.getPrecio();
        a5.getTiempoVida();
        a6.getPrecio();
        a6.getTiempoVida();
    }
}
