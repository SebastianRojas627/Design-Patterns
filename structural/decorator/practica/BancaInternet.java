package structural.decorator.practica;

public class BancaInternet extends Funcionalidades{

    private Boolean internetHabilitado;

    public BancaInternet(Component component, boolean internetHabilitado) {
        super(component);
        this.internetHabilitado = internetHabilitado;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        if (internetHabilitado){
            System.out.println("Funcionalidad banca por internet habilitada");
        } else {
            System.out.println("Funcionalidad banca por internet NO habilitada");
        }
    }

    @Override
    public void operation() {
        super.operation();
        internetHabilitado = !internetHabilitado;
        if (internetHabilitado){
            System.out.println("Funcionalidad banca por internet habilitada");
        } else {
            System.out.println("Funcionalidad banca por internet deshabilitada");
        }
    }
}
