package behavioral.memento.practica;

import java.util.LinkedList;
import java.util.List;

public class BaseDatos {

    List<Persona> baseDatos = new LinkedList<>();

    public void addPersona(Persona persona) {
        baseDatos.add(persona);
        getList();
    }

    public List getList() {
        return baseDatos;
    }

    public void setList(List baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void showInfo() {

        for(Persona persona: baseDatos) {
            persona.info();
        }
    }
}
