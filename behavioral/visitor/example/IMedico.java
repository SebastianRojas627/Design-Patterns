package behavioral.visitor.example;


public interface IMedico {

    void recetaTratamiento(Perro perrito);

    void recetaTratamiento(Gato gatito);

    void recetaTratamiento(Caballo caballito);
}