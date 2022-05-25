package creational.factoryMethod.practica;

public class CreatorChlidrensTicket extends TicketCreator {

    @Override
    public ChlidrensTicket createProduct(Person passenger, int seatNumber) {
        Airport origin = new Airport();
        origin.setCountry("Bolivia");
        origin.setAirport("El Alto International Airport");
        origin.setCity("La Paz");
        Airport destination = new Airport();
        destination.setCountry("Spain");
        destination.setAirport("Adolfo Suárez Madrid–Barajas Airport");
        destination.setCity("Madrid");
        Plane plane = new Plane();
        plane.setCapacity(83800);
        plane.setManufacturer("Boeing");
        plane.setModel("727");
        plane.setNumberOfSeats(189);
        ChlidrensTicket ticket = new ChlidrensTicket(destination, origin, plane, (Kid) passenger);
        ticket.setFlightNumber(255);
        ticket.setSeatNumber(seatNumber);
        ticket.setSpecialCost(1800);

        return ticket;
    }
}
