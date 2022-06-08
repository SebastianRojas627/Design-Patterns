package behavioral.mediator.practica;

public class Client {

    public static void main(String[] args) {

        Skype skype = new Skype();

        Profesional p1 = new Profesional(skype, "123456", "Diego", "QA", "mayor");
        Profesional p2 = new Profesional(skype, "123457", "Marcelo", "QA", "menor");
        Profesional p3 = new Profesional(skype, "123458", "Juan", "QA", "senior");
        Profesional p4 = new Profesional(skype, "123459", "Estanis", "DEV", "java");
        Profesional p5 = new Profesional(skype, "123460", "Rodrigo", "DEV", "c++");
        Profesional p6 = new Profesional(skype, "123461", "Samuel", "DEV", "python");
        Profesional p7 = new Profesional(skype, "123462", "Derek", "SM", "blockchain");
        Profesional p8 = new Profesional(skype, "123463", "Richard", "SM", "funcional");
        Profesional p9 = new Profesional(skype, "123464", "Pablo", "SM", "bases de datos");

        skype.addRegistrado(p1);
        skype.addRegistrado(p2);
        skype.addRegistrado(p3);
        skype.addRegistrado(p4);
        skype.addRegistrado(p5);
        skype.addRegistrado(p6);
        skype.addRegistrado(p7);
        skype.addRegistrado(p8);
        skype.addRegistrado(p9);

        p1.send("Para QAs");
        p5.send("Para DEVs");
        p8.send("Para todos");


    }
}
