package behavioral.memento.example;

public class Client {
    public static void main(String[] args) {
        Github github = new Github();
        Git git = new Git();

        Codigo codigo;
        codigo = new Codigo("public class..", "iniciado", false);

        codigo.setLiniasCodigo("public interface ..");
        codigo.setStoryComplete(true);

        git.setCommit(codigo);
        github.createCommit("5096ee", git.createCommit());
        codigo = new Codigo("puclic abstract clas...", "add persona", false);
        codigo = new Codigo("Class Person", "add persona", false);
        codigo = new Codigo("Class Est", "add estudiante", true);
        git.setCommit(codigo);
        github.createCommit("8096ez", git.createCommit());
        codigo = new Codigo("Class Doc", "add doc", false);
        codigo = new Codigo("Class Product", "add product", false);

        codigo.showInfo();

        codigo = git.restoreCommit(github.getCommit("8096ez"));
        codigo.showInfo();

    }
}
