package behavioral.interpreter.examples;

public class Client {

    public static void main(String[] args) {

        String msg = "1 + 3 + 4 - 4 - 8 + 100";
        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado: " + parser.evaluateMsg());
    }
}