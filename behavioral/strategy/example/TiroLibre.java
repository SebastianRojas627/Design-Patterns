package behavioral.strategy.example;

import java.util.List;

public class TiroLibre implements IJugada {

    @Override
    public void jugada(List<Jugador> equipo) {
        System.out.println("modo TiroLibre");
        for (Jugador jugador : equipo) {
            if (jugador.getPosition().equals("delantero")) {
                jugador.info();
                break;
            }
        }
    }
}