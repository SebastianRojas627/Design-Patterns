package factoryMethod.example.heladeria;

public class CreatorHeladoMixto extends Creator {

    @Override
    public HeladoMixto createProduct() {
        Fruta cereza = new Fruta();
        cereza.setCosto("5");
        cereza.setNombre("cereza");
        cereza.setSize("S");
        cereza.setTipoFruta("dulce");
        Base galleta = new Base();
        galleta.setCosto("6");
        galleta.setNombre("cracker");
        galleta.setTamano("6");
        galleta.setTipo("agua");
        Crema crema = new Crema();
        crema.setCosto("9");
        crema.setMarca("DEL");
        crema.setSabor("vainilla");
        HeladoMixto helado = new HeladoMixto(cereza, galleta, crema);
        helado.setCosto("52");
        helado.setSize("grande");
        helado.setForma("circular");
        return helado;
    }
}