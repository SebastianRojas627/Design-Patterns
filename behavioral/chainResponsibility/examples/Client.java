package behavioral.chainResponsibility.examples;

public class Client {

    public static void main(String[] args) {

        Persona p1 = new Persona(true, true,true);
        Persona p2 = new Persona(false, true,true);
        Persona p3 = new Persona(true, false,true);
        Persona p4 = new Persona(true, true,false);
        Persona p5 = new Persona(false, false,true);
        Persona p6 = new Persona(false, true,false);
        Persona p7 = new Persona(true, false,false);
        Persona p8 = new Persona(false, false,false);

        Manager manager = new Manager();
        manager.criteriaHandler(p1);
        manager.criteriaHandler(p2);
        manager.criteriaHandler(p3);
        manager.criteriaHandler(p4);
        manager.criteriaHandler(p5);
        manager.criteriaHandler(p6);
        manager.criteriaHandler(p7);
        manager.criteriaHandler(p8);

    }
}
