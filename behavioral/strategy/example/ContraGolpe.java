package behavioral.strategy.example;

import java.util.List;

public class ContraGolpe implements IJugada {

    @Override
    public void jugada(List<Jugador> equipo) {
        System.out.println("modo contragolpe");
        for (Jugador jugador : equipo) {
            if (jugador.getPosition().equals("delantero"))
                jugador.info();
        }

    }
}