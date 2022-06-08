package behavioral.mediator.practica;

import java.util.HashMap;
import java.util.Map;

public class Skype implements IComunicacion {

    private int index = 0;

    Map<Integer, Persona> registrados = new HashMap<>();

    public Skype addRegistrado(Persona persona) {
        registrados.put(index, persona);
        index++;
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {

        Profesional emisor = (Profesional) persona;

        for (int i = 0; i < registrados.size(); i++) {
            if (!emisor.getCi().equals(registrados.get(i).getCi())) {
                if (emisor.getCargo().equals("QA") && registrados.get(i).getCargo().equals("QA")) {
                    registrados.get(i).received(msg);
                } else if (emisor.getCargo().equals("DEV") && registrados.get(i).getCargo().equals("DEV")) {
                    registrados.get(i).received(msg);
                } else if (emisor.getCargo().equals("SM")) {
                    registrados.get(i).received(msg);
                }
            }
        }
    }
}
