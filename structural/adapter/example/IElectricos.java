package structural.adapter.example;

public interface IElectricos {

    void encender();

    void funcionando(int tiempoMarcha) throws InterruptedException;

    void cargando(int tiempo);

    void estadoBaterio();
}