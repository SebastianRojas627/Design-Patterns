package behavioral.interpreter.practica;

public class TerminalExpression1 extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")) {
            context.output = context.output + "I ";
            context.input = context.input.substring(1);
        }
    }
}
