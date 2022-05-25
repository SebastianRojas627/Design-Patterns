package creational.prototype.examples.entradas;

public class Client {
    public static void main(String[]args){
        Stadium hernandoS= new Stadium();
        hernandoS.setNombre("hernando siles");
        hernandoS.setCapacidad("100 asientos");

        Equipo local= new Equipo();
        local.setNombre("Bolivia");
        local.setRanking("66");
        local.setNroIntegrantes(30);

        Equipo visitante = new Equipo();
        visitante.setNombre("Brasil");
        visitante.setRanking("1");
        visitante.setNroIntegrantes(28);

        Entrada template= new Entrada();
        template.setVisitante(visitante);
        template.setLocal(local);
        template.setStadium(hernandoS);
        template.setLugar("La Paz");
        template.setDate("20/2/2022");
        template.setPrecio(100);

        Persona jose = new Persona();
        jose.setCi("111111");
        jose.setNombre("jose jose");

        Persona maria = new Persona();
        maria.setCi("222222");
        maria.setNombre("maria");

        Persona eynar = new Persona();
        eynar.setCi("3333333");
        eynar.setNombre("eynar");


        Entrada entrada1 = (Entrada) template.clone();
        entrada1.setNumAsiento(1);
        entrada1.setPersona(jose);

        Entrada entrada2 = (Entrada) template.clone();
        entrada2.setNumAsiento(2);
        entrada2.setPersona(maria);

        Entrada entrada3 = (Entrada) template.clone();
        entrada3.setNumAsiento(3);
        entrada3.setPersona(eynar);

        entrada1.showInfo();
        entrada2.showInfo();
        entrada3.showInfo();

    }

}
