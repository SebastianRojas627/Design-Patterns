package structural.bridge.practica;

public class Client {

    public static void main(String[] args) {

        Paquete paquete = new Paquete(150, "Polera");

        Aire aire = new Aire();
        Tierra tierra = new Tierra();

        SRL srl = new SRL(aire);
        srl.enviarPaquete(paquete, "Uruguay");
        srl.setMetodoEnvio(tierra);
        srl.enviarPaquete(paquete, "Uruguay");

        SA sa = new SA(tierra);
        sa.enviarPaquete(paquete, "Argentina");
        sa.setMetodoEnvio(aire);
        sa.enviarPaquete(paquete, "Uruguay");

        Mar mar = new Mar();

        srl.setMetodoEnvio(mar);
        srl.enviarPaquete(paquete, "Uruguay");

        sa.setMetodoEnvio(mar);
        sa.enviarPaquete(paquete, "Uruguay");
    }
}
