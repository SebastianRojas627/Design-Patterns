package behavioral.mediator.example;

import java.util.ArrayList;
import java.util.List;

public class Slack implements ICanalComunication {

    List<Profesional> profesionalChat = new ArrayList<>();

    public Slack addProfesionalChat(Profesional profesional) {
        profesionalChat.add(profesional);
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        Profesional emisor = (Profesional) persona;
        for (Profesional profesional : profesionalChat) {
            if (!emisor.getCi().equals(profesional.getCi())) {
                if (emisor.getCargo().equals("QA") && profesional.getCargo().equals("QA")) {
                    profesional.received(msg);
                } else if (emisor.getCargo().equals("DEV") && profesional.getCargo().equals("DEV")) {
                    profesional.received(msg);
                } else if (emisor.getCargo().equals("SM")) {
                    profesional.received(msg);
                }
            }
        }

    }
}