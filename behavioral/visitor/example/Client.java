package behavioral.visitor.example;

public class Client {

    public static void main(String[] args) {

        Caballo caballo = new Caballo();
        caballo.setColor("cafe");
        caballo.setEdad(2);
        caballo.setName("pony");
        caballo.setTipo("carrera");
        caballo.setEnfermedad("enfermedad1");
        caballo.setEnfermedad("enfermedad2");
        Gato gato = new Gato();
        gato.setColor("blanco");
        gato.setEdad(5);
        gato.setName("tigre");
        gato.setRaza("normal");
        gato.setEnfermedad("enfermedad1");
        Perro perro = new Perro();
        perro.setColor("negro");
        perro.setEdad(10);
        perro.setName("byte");
        perro.setRaza("criollo");
        perro.setEnfermedad("resfrio");

        Veterinario veterinario = new Veterinario();

        perro.accept(veterinario);
        gato.accept(veterinario);
        caballo.accept(veterinario);

    }
}