package prototype.practica;

public class Cellphone implements ICellphone {

    private double size;
    private String cpu;
    private int memory;
    private SIM sim = new SIM();
    private double androidVersion;
    private double cameraMPX;
    private int bluetooth;
    private int nOfExternalMemorySlots;
    private String batteryType;
    private Charger charger = new Charger();
    private Case cellphoneCase = new Case();
    private Earphones earphones = new Earphones();


    public Cellphone() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public double getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(double androidVersion) {
        this.androidVersion = androidVersion;
    }

    public double getCameraMPX() {
        return cameraMPX;
    }

    public void setCameraMPX(double cameraMPX) {
        this.cameraMPX = cameraMPX;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getnOfExternalMemorySlots() {
        return nOfExternalMemorySlots;
    }

    public void setnOfExternalMemorySlots(int nOfExternalMemorySlots) {
        this.nOfExternalMemorySlots = nOfExternalMemorySlots;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public Case getCellphoneCase() {
        return cellphoneCase;
    }

    public void setCellphoneCase(Case cellphoneCase) {
        this.cellphoneCase = cellphoneCase;
    }

    public Earphones getEarphones() {
        return earphones;
    }

    public void setEarphones(Earphones earphones) {
        this.earphones = earphones;
    }

    @Override
    public Cellphone clone() {

        SIM cloneS = new SIM();
        cloneS.setCellphoneNumber(this.getSim().getCellphoneNumber());
        cloneS.setCompanyName(this.getSim().getCompanyName());

        Charger cloneC = new Charger();
        cloneC.setLength(this.getCharger().getLength());
        cloneC.setName(this.getCharger().getName());

        Case cloneCase = new Case();
        cloneCase.setName(this.getCellphoneCase().getName());
        cloneCase.setColor(this.getCellphoneCase().getColor());

        Earphones cloneE = new Earphones();
        cloneE.setName(this.getEarphones().getName());
        cloneE.setInalambric(this.getEarphones().getInalambric());

        Cellphone clone = new Cellphone();
        clone.setSize(this.getSize());
        clone.setCpu(this.getCpu());
        clone.setMemory(this.getMemory());
        clone.setSim(cloneS);
        clone.setAndroidVersion(this.getAndroidVersion());
        clone.setCameraMPX(this.getCameraMPX());
        clone.setBluetooth(this.getBluetooth());
        clone.setnOfExternalMemorySlots(this.getnOfExternalMemorySlots());
        clone.setBatteryType(this.getBatteryType());
        clone.setCharger(cloneC);
        clone.setCellphoneCase(cloneCase);
        clone.setEarphones(cloneE);

        return clone;
    }

    public void showCellphoneInfo() {
        System.out.println("\n **** INFORMACION DEL CELULAR ****");
        System.out.println("Tamaño: " + size + "cm");
        System.out.println("cpu: " + cpu);
        System.out.println("Memoria: " + memory + "GB");
        System.out.println("SIM de " + sim.getCompanyName() + " con el numero: " + sim.getCellphoneNumber());
        System.out.println("Version de Android: " + androidVersion);
        System.out.println("Camara de: " + cameraMPX + "MPX");
        System.out.println("Bluetooth version: " + bluetooth);
        System.out.println("Cantidad de memorias externas: " + nOfExternalMemorySlots);
        System.out.println("Bateria: " + batteryType);
        if (charger.getName() != null)
            System.out.println("Cargador: " + charger.getName() + " de longitud " + charger.getName() + " metros");
        if (cellphoneCase.getName() != null)
            System.out.println("Case: " + cellphoneCase.getName() + " de color " + cellphoneCase.getColor());
        if (earphones.getName() != null) {
            System.out.print("Audifonos: " + earphones.getName());
            if (earphones.getInalambric())
                System.out.println(" con capacidad inalambrica");
        }
    }
}
