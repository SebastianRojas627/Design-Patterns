package behavioral.strategy.example;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String name;
    private List<Jugador> jugadorList = new ArrayList<>();
    private IJugada strategyGame;

    public Equipo(String name) {
        this.name = name;
    }

    public void addJugador(Jugador jugador) {
        jugadorList.add(jugador);
    }

    public IJugada getStrategyGame() {
        return strategyGame;
    }

    public void setStrategyGame(IJugada strategyGame) {
        this.strategyGame = strategyGame;
    }

    public void iniciarJugada() {
        strategyGame.jugada(jugadorList);
    }
}