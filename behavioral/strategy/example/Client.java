package behavioral.strategy.example;

public class Client {

    public static void main(String[] args) {

        Equipo equipoFutbol = new Equipo("upb");
        equipoFutbol.addJugador(new Jugador("eynar1", "delantero"));
        equipoFutbol.addJugador(new Jugador("eynar2", "medio campo"));
        equipoFutbol.addJugador(new Jugador("eynar3", "defensa"));
        equipoFutbol.addJugador(new Jugador("eynar4", "defensa"));
        equipoFutbol.addJugador(new Jugador("eynar5", "delantero"));
        equipoFutbol.addJugador(new Jugador("eynar6", "medio campo"));
        equipoFutbol.addJugador(new Jugador("eynar7", "medio campo"));


        equipoFutbol.setStrategyGame(new TiroLibre());
        equipoFutbol.iniciarJugada();

    }
}