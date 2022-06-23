package structural.bridge.practica;

public class SRL implements IEmpresa{

    private IMetodoEnvio metodoEnvio;

    public SRL(IMetodoEnvio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public void setMetodoEnvio(IMetodoEnvio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    @Override
    public void enviarPaquete(Paquete paquete, String destino) {

        System.out.println("\n EMPRESA SRL realizando envio del paquete " + paquete.getNombrePaquete() + " con destino " + destino);
        metodoEnvio.realizarEnvio(paquete);
    }
}
