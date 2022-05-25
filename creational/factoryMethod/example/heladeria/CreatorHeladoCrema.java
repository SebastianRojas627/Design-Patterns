package creational.factoryMethod.example.heladeria;

public class CreatorHeladoCrema extends Creator {

    @Override
    public HeladoCrema createProduct() {
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
        Crema crema = new Crema();
        crema.setCosto("9");
        crema.setMarca("DEL");
        crema.setSabor("vainilla");
        HeladoCrema helado = new HeladoCrema(cereza, galleta, crema);
        helado.setSize("grande");
        helado.setForma("circular");
        return helado;
    }
}