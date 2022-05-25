package creational.factoryMethod.practica;

public class SolidaryTicket implements ITicket {

    private int flightNumber;
    private int seatNumber;
    private int discount;
    private String discountReason;
    private double ticketCost;
    private Airport destination;
    private Airport origin;
    private Plane plane;
    private Person passenger;


    public SolidaryTicket(Airport destination, Airport origin, Plane plane, Person passenger) {
        this.destination = destination;
        this.origin = origin;
        this.plane = plane;
        this.passenger = passenger;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Person getPassenger() {
        return passenger;
    }

    public void setPassenger(Person passenger) {
        this.passenger = passenger;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDiscountReason() {
        return discountReason;
    }

    public void setDiscountReason(String discountReason) {
        this.discountReason = discountReason;
    }

    @Override
    public void showInfo() {
        System.out.println("\n *** SOLIDARITY TICKET ***");
        System.out.println("Flight number: " + getFlightNumber());
        System.out.println("Origin: " + getOrigin().getCity() + ", " + getOrigin().getCountry() + ", airport: " + getOrigin().getAirport());
        System.out.println("Destination: " + getDestination().getCity() + ", " + getDestination().getCountry() + ", airport: " + getDestination().getAirport());
        System.out.println("Plane: " + getPlane().getManufacturer() + ", " + getPlane().getModel() + ", with a capacity of " + getPlane().getCapacity() + "kg and " + getPlane().getNumberOfSeats() + " seats");
        System.out.println("Passenger: " + getPassenger().getName() + ", CI: " + getPassenger().getCi());
        System.out.println("Seat number: " + getSeatNumber());
        System.out.println("Cost: $" + getTicketCost());
        System.out.println("Discount: $" + getDiscount());
        System.out.println("Discount reason: " + getDiscountReason());
    }
}
