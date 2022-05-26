package behavioral.interpreter.examples;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends OperationM {

    private List<OperationM> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter) {
        // 4 + 3 + 4 - 4
        context = new Context(msgToInterpreter.replace(" ", ""));
        for (String charOriginal : msgToInterpreter.split(" ")) {
            switch (charOriginal) {
                case "+":
                    grammar.add(new Addition(charOriginal.length()));
                    break;
                case "-":
                    grammar.add(new Substraction(charOriginal.length()));
                    break;
                default:
                    grammar.add(new Number(charOriginal.length()));
                    break;
            }
        }
    }

    public int evaluateMsg() {

        for (OperationM expression : grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }
}