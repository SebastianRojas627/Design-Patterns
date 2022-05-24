package factoryMethod.example.heladeria;

public class CreatorHeladoAgua extends Creator {

    @Override
    public HeladoAgua createProduct() {
        Fruta cereza = new Fruta();
        cereza.setCosto("53");
        cereza.setNombre("cereza");
        cereza.setSize("S");
        cereza.setTipoFruta("dulce");
        Base galleta = new Base();
        galleta.setCosto("63");
        galleta.setNombre("cracker");
        galleta.setTamano("63");
        galleta.setTipo("agua");
        HeladoAgua helado = new HeladoAgua(cereza, galleta);
        helado.setSize("grande");
        helado.setForma("circular");
        return helado;
    }
}