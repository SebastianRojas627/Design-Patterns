package abstractFactory.examples.ide;

public class FactoryIDE {
    public static Ide make(String type) {
        Ide ide;
        switch (type) {
            case "eclipse":
                ide = new Eclipse();
                break;
            case "idea":
                ide = new IntelliJIdea();
                break;
            case "visualcode":
                ide = new VisualCode();
                break;
            default:
                ide = new VisualStudio();
                break;
        }
        return ide;
    }


}