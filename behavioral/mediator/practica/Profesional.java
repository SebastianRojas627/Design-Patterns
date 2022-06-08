package behavioral.mediator.practica;

public class Profesional extends Persona {

    private String especializacion;

    public Profesional(IComunicacion canalComunication, String ci, String name, String cargo, String especializacion) {
        super(canalComunication, ci, name, cargo, especializacion);
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO> ci: " + getCi() + " name: " + getName() + " especializacion: " + getEspecializacion() + " cargo: " + getCargo());
        System.out.println("INFO> received " + msg);
    }
}
