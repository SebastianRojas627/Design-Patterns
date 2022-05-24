package factoryMethod.practica;

public class ChlidrensTicket implements ITicket {

    private int flightNumber;
    private int seatNumber;
    private double specialCost;
    private Airport destination;
    private Airport origin;
    private Plane plane;
    private Kid passenger;


    public ChlidrensTicket(Airport destination, Airport origin, Plane plane, Kid passenger) {
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

    public Kid getPassenger() {
        return passenger;
    }

    public void setPassenger(Kid passenger) {
        this.passenger = passenger;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getSpecialCost() {
        return specialCost;
    }

    public void setSpecialCost(double specialCost) {
        this.specialCost = specialCost;
    }

    @Override
    public void showInfo() {
        System.out.println("\n *** CHILDRENS TICKET ***");
        System.out.println("Flight number: " + getFlightNumber());
        System.out.println("Origin: " + getOrigin().getCity() + ", " + getOrigin().getCountry() + ", airport: " + getOrigin().getAirport());
        System.out.println("Destination: " + getDestination().getCity() + ", " + getDestination().getCountry() + ", airport: " + getDestination().getAirport());
        System.out.println("Plane: " + getPlane().getManufacturer() + ", " + getPlane().getModel() + ", with a capacity of " + getPlane().getCapacity() + "kg and " + getPlane().getNumberOfSeats() + " seats");
        System.out.println("Passenger: " + getPassenger().getName() + ", CI: " + getPassenger().getCi() + ", born on " + getPassenger().getDateBirth());
        System.out.println("Seat number: " + getSeatNumber());
        System.out.println("Cost: $" + getSpecialCost());
    }
}
