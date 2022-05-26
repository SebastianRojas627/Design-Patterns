package behavioral.interpreter.practica;

public class Client {

    public static void main(String[] args) {

        String msg = "10 10 9 9 8 8 7 7 6 6 5 5 4 4 3 3 2 2 1 1";
        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado: " + parser.evaluateMsg());
    }
}
