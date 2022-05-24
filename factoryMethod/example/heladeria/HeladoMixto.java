package factoryMethod.example.heladeria;

public class HeladoMixto implements IHelado {
    private String size;
    private String forma;
    private Fruta fruta;
    private Base base;
    private Crema crema;
    private String costo;

    public HeladoMixto(Fruta fruta, Base base, Crema crema) {
        this.fruta = fruta;
        this.base = base;
        this.crema = crema;
    }

    @Override
    public void showInfo() {
        System.out.println("HELADO MIXTO");

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
        System.out.println("crema" + crema.getCosto());
        System.out.println("crema" + crema.getMarca());
        System.out.println("crema" + crema.getSabor());
        System.out.println("costo" + costo);

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

    public Fruta getFrutal() {
        return fruta;
    }

    public void setFrutal(Fruta frutal) {
        this.fruta = frutal;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}