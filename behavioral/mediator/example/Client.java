package behavioral.mediator.example;

public class Client {
    public static void main(String[] args) {
        Slack slackUPB = new Slack();

        Profesional sm1 = new Profesional(slackUPB);
        sm1.setCargo("SM").setCi("123").setName("jose1");
        Profesional sm2 = new Profesional(slackUPB);
        sm2.setCargo("SM").setCi("1234").setName("jose2");

        Profesional dev1 = new Profesional(slackUPB);
        dev1.setCargo("DEV").setCi("4444").setName("maria1");
        Profesional dev2 = new Profesional(slackUPB);
        dev2.setCargo("DEV").setCi("5555").setName("maria2");
        Profesional dev3 = new Profesional(slackUPB);
        dev3.setCargo("DEV").setCi("6666").setName("maria3");

        Profesional qa1 = new Profesional(slackUPB);
        qa1.setCargo("QA").setCi("888").setName("ana1");
        Profesional qa2 = new Profesional(slackUPB);
        qa2.setCargo("QA").setCi("999").setName("ana2");
        Profesional qa3 = new Profesional(slackUPB);
        qa3.setCargo("QA").setCi("987").setName("ana3");
        Profesional qa4 = new Profesional(slackUPB);
        qa4.setCargo("QA").setCi("987444").setName("eynar4");
        slackUPB.addProfesionalChat(sm1)
                .addProfesionalChat(sm2)
                .addProfesionalChat(dev1)
                .addProfesionalChat(dev2)
                .addProfesionalChat(dev3)
                .addProfesionalChat(qa1)
                .addProfesionalChat(qa2)
                .addProfesionalChat(qa4)
                .addProfesionalChat(qa3);


        sm1.send("esto es para todos");
        dev2.send("esto es para el dev1 y dev3");
        qa3.send("error encontrado, verificar qa1,qa2");


    }

}