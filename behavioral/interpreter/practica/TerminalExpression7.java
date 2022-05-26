package behavioral.interpreter.practica;

public class TerminalExpression7 extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("7")) {
            context.output = context.output + "VII ";
            context.input = context.input.substring(1);
        }
    }
}
