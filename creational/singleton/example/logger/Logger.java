package creational.singleton.example.logger;

import java.util.Date;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println(new Date() + "-INFO > Iniciando el Logger");
    }

    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public void info(String valor) {
        System.out.println(new Date() + "-INFO > " + valor);
    }

    public void warn(String valor) {
        System.out.println(new Date() + "-WARN > " + valor);
    }

    public void error(String valor) {
        System.out.println(new Date() + "-ERROR > " + valor);
    }

}