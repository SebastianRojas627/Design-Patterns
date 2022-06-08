package behavioral.memento.practica;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

    private Map<String, Memento> alias = new HashMap<>();

    public void createAlias(String aliasFormat, Memento m) {
        alias.put(aliasFormat, m);
    }

    public Memento getAlias(String aliasFormat) {
        return alias.get(aliasFormat);
    }
}
