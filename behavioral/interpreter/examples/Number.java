package behavioral.interpreter.examples;

public class Number extends OperationM {

    public Number(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        context.output = context.output + (Integer.parseInt(context.input.substring(0, this.digit)) * context.signo);
        context.input = context.input.substring(this.digit);
    }
}