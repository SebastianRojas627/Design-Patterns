package behavioral.mediator.practica;

public abstract class Persona {

    protected IComunicacion canalComunication;
    private String ci;
    private String name;
    private String cargo;
    private String especializacion;

    public Persona(IComunicacion canalComunication, String ci, String name, String cargo, String especializacion) {
        this.canalComunication = canalComunication;
        this.ci = ci;
        this.name = name;
        this.cargo = cargo;
        this.especializacion = especializacion;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public abstract void send(String msg);

    public abstract void received(String msg);
}