package structural.proxy.practica;

public interface IBanco {

    void realizarCompra(IMoneda moneda, double cantidad);

    void depositar(IMoneda moneda, double cantidad);
}
