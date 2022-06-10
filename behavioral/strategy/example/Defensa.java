package behavioral.strategy.example;

import java.util.List;

public class Defensa implements IJugada {

    @Override
    public void jugada(List<Jugador> equipo) {
        for (Jugador jugador : equipo) {
            if (jugador.getPosition().equals("defensa"))
                jugador.info();
        }

        for (Jugador jugador : equipo) {
            if (jugador.getPosition().equals("medio campo"))
                jugador.setMode("defensa");
        }

        System.out.println("*** modo defensa ***");
        for (Jugador jugador : equipo) {
            if (jugador.getMode().equals("defensa"))
                jugador.info();
        }

    }
}