package behavioral.chainResponsibility.examples;

public class Persona {

    public boolean certiNacimiento;
    public boolean pagoBanco;
    public boolean fichaAtencion;

    public Persona(boolean certiNacimiento, boolean pagoBanco, boolean fichaAtencion) {

        this.certiNacimiento = certiNacimiento;
        this.pagoBanco = pagoBanco;
        this.fichaAtencion = fichaAtencion;

    }

    public boolean isCertiNacimiento() {
        return certiNacimiento;
    }

    public boolean isPagoBanco() {
        return pagoBanco;
    }

    public boolean isFichaAtencion() {
        return fichaAtencion;
    }

}
