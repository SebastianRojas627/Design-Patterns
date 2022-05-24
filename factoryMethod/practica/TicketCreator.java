package factoryMethod.practica;

public abstract class TicketCreator {

    public TicketCreator() {
    }

    public abstract ITicket createProduct(Person passenger, int seatNumber);
}
