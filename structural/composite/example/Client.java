package structural.composite.example;

public class Client {

    public static void main(String[] args) {

        Entity task1 = new Entity("Task");
        task1.setTitulo("Tarea 1 crear repositorio")
                .setDescription("crear repositorio en github")
                .setEstimation(2)
                .setPriority(3)
                .setSpace("\t\t\t\t");
        Entity task2 = new Entity("Task");
        task2.setTitulo("Tarea 2 crear modelo entidad relacion")
                .setDescription("crear mysql")
                .setEstimation(5)
                .setPriority(7)
                .setSpace("\t\t\t\t");
        Entity task3 = new Entity("Task");
        task3.setTitulo("Tarea 3 crear project en jira")
                .setDescription("adicionar a los usuarios")
                .setEstimation(2)
                .setPriority(1)
                .setSpace("\t\t\t\t");


        CompositeEntity userStory1 = new CompositeEntity("User Story");
        userStory1.setTitulo("Definir Tecnologias")
                .setDescription("des 1")
                .setPriority(1)
                .setSpace("\t\t");
        userStory1.add(task1);
        userStory1.add(task2);
        userStory1.add(task3);

        CompositeEntity userStory2 = new CompositeEntity("User Story");
        userStory2.setTitulo("Crear Authenticacion")
                .setDescription("desssssss 1")
                .setPriority(1)
                .setSpace("\t\t");
        userStory2.add(task1);
        userStory2.add(task2);
        userStory2.add(task3);


        CompositeEntity feature1 = new CompositeEntity("Feature");
        feature1.setTitulo("Usuarios")
                .setDescription("Usuarios/Roles")
                .setPriority(1);

        feature1.add(userStory1);
        feature1.add(userStory2);

        feature1.detailAgileBoard();

    }

}
