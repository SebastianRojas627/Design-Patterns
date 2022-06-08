package behavioral.observer.practica;

public class Client {

    public static void main(String[] args) {

        User u1 = new User("111", "Manuel", true, true, true, true);
        User u2 = new User("222", "Rodrigo", false, false, false, false);

        Empresa empresa = new Empresa();

        empresa.subscription(u1);
        empresa.subscription(u2);

        PrecioLLamada n1 = new PrecioLLamada(69);
        PrecioLLamada n2 = new PrecioLLamada(30);
        Noticia n3 = new Noticia("No hay clases jueves");
        Noticia n4 = new Noticia("No hay clases martes");
        Premios n5 = new Premios("Celular nuevo");
        Premios n6 = new Premios("Parlante nuevo");
        Promociones n7 = new Promociones("Todo a mitad de precio");
        Promociones n8 = new Promociones("Poleras en remate");

        empresa.setPrecioLLamada(n1);
        empresa.setNoticia(n3);
        empresa.setPremios(n5);
        empresa.setPromociones(n7);

        u1.setPrecioLlamadas(false);
        u2.setPrecioLlamadas(true);
        empresa.setPrecioLLamada(n2);

        u2.setNoticia(true);
        empresa.setNoticia(n4);

        u1.setPremios(false);
        empresa.setPremios(n6);

        u2.setPromociones(true);
        empresa.setPromociones(n8);
    }
}
