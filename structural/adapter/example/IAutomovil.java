package structural.adapter.example;

public interface IAutomovil {

    void prender();

    void marcha(int tiempoMarcha) throws InterruptedException;

    void cargando(int tiempo);
}