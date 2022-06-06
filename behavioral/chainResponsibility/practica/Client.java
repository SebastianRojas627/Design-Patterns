package behavioral.chainResponsibility.practica;

public class Client {

    public static void main(String[] args) {

        Persona[] p1 = new Persona[15];
        Persona[] p2 = new Persona[25];
        Persona[] p3 = new Persona[52];

        for (int i = 0; i < p1.length; i++) {
            p1[i] = new Persona(123456, "Nombre Prueba" , i + 10);
        }

        for (int i = 0; i < p2.length; i++) {
            p2[i] = new Persona(123456, "Nombre Prueba" , i + 10);
        }

        for (int i = 0; i < p3.length; i++) {
            p3[i] = new Persona(123456, "Nombre Prueba" , i + 10);
        }

        SortManager manager = new SortManager();
        manager.criteriaHandler(p1);
        manager.criteriaHandler(p2);
        manager.criteriaHandler(p3);
    }
}
