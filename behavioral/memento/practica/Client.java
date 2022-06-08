package behavioral.memento.practica;

public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        BaseDatos baseDatos;
        baseDatos = new BaseDatos();

        Persona p1 = new Persona("Diego", "123450", 23);
        Persona p2 = new Persona("Manuel", "123451", 26);
        Persona p3 = new Persona("Cerroso", "123452", 28);
        Persona p4 = new Persona("Santiago", "123453", 31);
        Persona p5 = new Persona("Mateo", "123454", 36);
        Persona p6 = new Persona("Gabriel", "123455", 44);
        Persona p7 = new Persona("Nicolas", "123456", 57);
        Persona p8 = new Persona("Erick", "123457", 70);
        Persona p9 = new Persona("Simon", "123458", 15);
        Persona p10 = new Persona("Marcos", "123459", 14);

        baseDatos.addPersona(p1);
        baseDatos.addPersona(p2);

        originator.setAlias(baseDatos);
        caretaker.createAlias("primero", originator.createAlias());

        baseDatos = new BaseDatos();

        baseDatos.addPersona(p1);
        baseDatos.addPersona(p2);
        baseDatos.addPersona(p3);
        baseDatos.addPersona(p4);

        originator.setAlias(baseDatos);
        caretaker.createAlias("segundo", originator.createAlias());

        baseDatos = new BaseDatos();

        baseDatos.addPersona(p1);
        baseDatos.addPersona(p2);
        baseDatos.addPersona(p3);
        baseDatos.addPersona(p4);
        baseDatos.addPersona(p5);
        baseDatos.addPersona(p6);

        originator.setAlias(baseDatos);
        caretaker.createAlias("tercero", originator.createAlias());

        baseDatos = new BaseDatos();

        baseDatos.addPersona(p1);
        baseDatos.addPersona(p2);
        baseDatos.addPersona(p3);
        baseDatos.addPersona(p4);
        baseDatos.addPersona(p5);
        baseDatos.addPersona(p6);
        baseDatos.addPersona(p7);
        baseDatos.addPersona(p8);

        originator.setAlias(baseDatos);
        caretaker.createAlias("cuarto", originator.createAlias());

        baseDatos = new BaseDatos();

        baseDatos.addPersona(p1);
        baseDatos.addPersona(p2);
        baseDatos.addPersona(p3);
        baseDatos.addPersona(p4);
        baseDatos.addPersona(p5);
        baseDatos.addPersona(p6);
        baseDatos.addPersona(p7);
        baseDatos.addPersona(p8);
        baseDatos.addPersona(p9);
        baseDatos.addPersona(p10);

        originator.setAlias(baseDatos);
        caretaker.createAlias("quinto", originator.createAlias());

        baseDatos.showInfo();

        baseDatos = originator.restoreAlias(caretaker.getAlias("primero"));
        baseDatos.showInfo();

    }
}
