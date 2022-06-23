package structural.bridge.practica;

public class SA implements IEmpresa{

    private IMetodoEnvio metodoEnvio;

    public SA(IMetodoEnvio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public void setMetodoEnvio(IMetodoEnvio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    @Override
    public void enviarPaquete(Paquete paquete, String destino) {

        System.out.println("\n EMPRESA SA realizando envio del paquete " + paquete.getNombrePaquete() + " con destino " + destino);
        metodoEnvio.realizarEnvio(paquete);
    }
}
