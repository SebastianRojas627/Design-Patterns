package behavioral.interpreter.practica;

public class TerminalExpression2 extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("2")) {
            context.output = context.output + "II ";
            context.input = context.input.substring(1);
        }
    }
}
