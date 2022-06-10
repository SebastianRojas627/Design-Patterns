package behavioral.strategy.example;

import java.util.List;

public class Ataque implements IJugada {

    @Override
    public void jugada(List<Jugador> equipo) {
        System.out.println("modo Ataque");
        for (Jugador jugador : equipo) {
            if (!jugador.getPosition().equals("defensa"))
                jugador.info();
        }
    }
}