package behavioral.visitor.example;

import java.util.Date;

public class Veterinario implements IMedico {
    @Override
    public void recetaTratamiento(Perro perrito) {
        System.out.println("INFO> revisando al Perrito");
        perrito.showInfo();
        //enfermedades
        for (String enf : perrito.getEnfermedad()
        ) {
            System.out.println("tipo de enfermedad: " + enf);
            System.out.println("recentando medicina/tratamiento: " + new Date());
        }
    }

    @Override
    public void recetaTratamiento(Gato gatito) {
        System.out.println("INFO> revisando al gatito");
        gatito.showInfo();
        //enfermedades
        for (String enf : gatito.getEnfermedad()
        ) {
            System.out.println("tipo de enfermedad: " + enf);
            System.out.println("recentando medicina/tratamiento: " + new Date());
        }
    }

    @Override
    public void recetaTratamiento(Caballo caballito) {
        System.out.println("INFO> revisando al caballito");
        caballito.showInfo();
        //enfermedades
        for (String enf : caballito.getEnfermedad()
        ) {
            System.out.println("tipo de enfermedad: " + enf);
            System.out.println("recentando medicina/tratamiento: " + new Date());
        }
    }
}