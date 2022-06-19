package behavioral.visitor.practica;

public class Client {

    public static void main(String[] args) {

        Argentina argentina = new Argentina();
        Bolivia bolivia = new Bolivia();
        Brasil brasil = new Brasil();
        Italia italia = new Italia();

        Librecambista librecambista = new Librecambista();

        argentina.accept(librecambista, 200, true);
        argentina.accept(librecambista, 300, false);

        bolivia.accept(librecambista, 400, true);
        bolivia.accept(librecambista, 500, false);

        brasil.accept(librecambista, 600, true);
        brasil.accept(librecambista, 700, false);

        italia.accept(librecambista, 800, true);
        italia.accept(librecambista, 900, false);
    }
}
