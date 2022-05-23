package singleton.structure;

public class ClientSingleton3 {

    public static void main(String[] args) {

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3.getInstance().time();
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3.getInstance().time();
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3.getInstance().time();
            }
        });

        user1.start();
        user2.start();
        user3.start();

    }
}
