package creational.prototype.examples.entradas;

public class Entrada implements IEntrada {

    private int precio = 0;
    private int numAsiento;
    private String date;
    private String lugar;
    private Stadium stadium = new Stadium();
    private Persona persona = new Persona();
    private Equipo local = new Equipo();
    private Equipo visitante = new Equipo();

    public Entrada() {
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Object clone() {
        Equipo cloneV = new Equipo();
        cloneV.setNombre(this.getVisitante().getNombre());
        cloneV.setNroIntegrantes(this.getVisitante().getNroIntegrantes());
        cloneV.setRanking(this.getVisitante().getRanking());

        Equipo cloneL = new Equipo();
        cloneL.setNombre(this.getLocal().getNombre());
        cloneL.setNroIntegrantes(this.getLocal().getNroIntegrantes());
        cloneL.setRanking(this.getLocal().getRanking());

        Persona cloneP = new Persona();
        cloneP.setNombre(this.getPersona().getNombre());
        cloneP.setCi(this.getPersona().getCi());

        Stadium cloneS = new Stadium();
        cloneS.setNombre(this.getStadium().getNombre());
        cloneS.setCapacidad(this.getStadium().getCapacidad());

        Entrada clone = new Entrada();
        clone.setPrecio(this.getPrecio());
        clone.setNumAsiento(this.getNumAsiento());
        clone.setDate(this.getDate());
        clone.setLugar(this.getLugar());
        clone.setLocal(cloneL);
        clone.setPersona(cloneP);
        clone.setStadium(cloneS);
        clone.setVisitante(cloneV);
        return clone;
    }

    public void showInfo() {
        System.out.println(" \n ****  Information de la Entrada *** \n");
        System.out.println("precio: " + precio);
        System.out.println("numAsient: " + numAsiento);
        System.out.println("date: " + date);
        System.out.println("lugar: " + lugar);
        System.out.println("stadium cap: " + stadium.getCapacidad());
        System.out.println("stadium nom: " + stadium.getNombre());
        System.out.println("persona ci: " + persona.getCi());
        System.out.println("persona nom: " + persona.getNombre());
        System.out.println("local nom: " + local.getNombre());
        System.out.println("local rank : " + local.getRanking());
        System.out.println("local #: " + local.getNroIntegrantes());
        System.out.println("visitante nom: " + visitante.getNombre());
        System.out.println("visitante rank : " + visitante.getRanking());
        System.out.println("visitante #: " + visitante.getNroIntegrantes());
    }
}