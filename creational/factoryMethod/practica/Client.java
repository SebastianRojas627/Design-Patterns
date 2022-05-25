package creational.factoryMethod.practica;

public class Client {

    public static void main(String[] args) {

        Person p1 = new Person("Marcelo Bielsa", 7462341);
        Person p2 = new Person("Rodrigo Bentancur", 8523474);
        Person p3 = new Person("Diego Vlahovic", 8126497);
        Person p4 = new Person("Armando Suarez", 7498547);
        Kid p5 = new Kid("Ramiro Petro", 4567982, "3-04-2008");
        Kid p6 = new Kid("Bernardo Doherty", 8726549, "22-08-2010");

        StandardTicket t1 = new CreatorStandardTicket().createProduct(p1, 45);
        StandardTicket t2 = new CreatorStandardTicket().createProduct(p2, 89);
        SolidaryTicket t3 = new CreatorSolidaryTicket().createProduct(p3, 71);
        SolidaryTicket t4 = new CreatorSolidaryTicket().createProduct(p4, 10);
        ChlidrensTicket t5 = new CreatorChlidrensTicket().createProduct(p5, 150);
        ChlidrensTicket t6 = new CreatorChlidrensTicket().createProduct(p6, 9);

        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
        t4.showInfo();
        t5.showInfo();
        t6.showInfo();

    }
}
