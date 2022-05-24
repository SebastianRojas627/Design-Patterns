package factoryMethod.example.heladeria;

public class HeladoAgua implements IHelado {
    private String size;
    private String forma;
    private Fruta fruta;
    private Base base;

    public HeladoAgua(Fruta fruta, Base base) {
        this.fruta = fruta;
        this.base = base;
    }

    @Override
    public void showInfo() {
        System.out.println("HELADO AGUA");

        System.out.println("size " + size);
        System.out.println("forma " + forma);
        System.out.println("fruta costo " + fruta.getCosto());
        System.out.println("fruta tipo " + fruta.getTipoFruta());
        System.out.println("fruta nombre " + fruta.getNombre());
        System.out.println("fruta tamano " + fruta.getSize());
        System.out.println("base costo " + base.getCosto());
        System.out.println("base nombre " + base.getNombre());
        System.out.println("base tamano " + base.getTamano());
        System.out.println("base tipo" + base.getTipo());
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getfruta() {
        return fruta;
    }

    public void setfruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}