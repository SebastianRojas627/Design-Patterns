package structural.decorator.practica;

import java.util.Random;

public class Promocion extends Funcionalidades{

    Random rand = new Random();

    public Promocion(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        int int_random = rand.nextInt(10);
        if(int_random % 2 == 0) {
            super.setMonto(super.getMonto() * 2);
            System.out.println("Felicitaciones en su victoria de la promocion, los fondos de su cuenta fueron duplicados");
        } else {
            System.out.println("No fue el ganador de la promocion");
        }

    }
}
