package behavioral.interpreter.practica;

public class TerminalExpression6 extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("6")) {
            context.output = context.output + "VI ";
            context.input = context.input.substring(1);
        }
    }
}
