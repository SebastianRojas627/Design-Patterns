package prototype.practica;

public class Client {

    public static void main(String[] args) {
        Case phoneCase = new Case();
        phoneCase.setColor("rojo");
        phoneCase.setName("portacelulares indestructible");

        Charger phoneCharger = new Charger();
        phoneCharger.setName("cargador Samsung");
        phoneCharger.setLength(2);

        Earphones inalambric = new Earphones();
        inalambric.setInalambric(true);
        inalambric.setName("audifonos inalambricos Samsung");

        Earphones alambric = new Earphones();
        alambric.setName("audifonos de cable Samsung");
        alambric.setInalambric(false);

        SIM sim1 = new SIM();
        sim1.setCompanyName("Entel");
        sim1.setCellphoneNumber(76548895);

        SIM sim2 = new SIM();
        sim2.setCellphoneNumber(71498354);
        sim2.setCompanyName("Viva");

        SIM sim3 = new SIM();
        sim3.setCompanyName("Tigo");
        sim3.setCellphoneNumber(68714297);

        Cellphone template = new Cellphone();
        template.setSize(18.5);
        template.setCpu("Octacore Qualcom");
        template.setMemory(128);
        template.setAndroidVersion(7.5);
        template.setCameraMPX(17.9);
        template.setBluetooth(10);
        template.setnOfExternalMemorySlots(2);
        template.setBatteryType("Litio de 2800mAh");

        Cellphone cellphone1 = (Cellphone) template.clone();
        cellphone1.setSim(sim1);
        cellphone1.setEarphones(alambric);
        cellphone1.setCharger(phoneCharger);

        Cellphone cellphone2 = (Cellphone) template.clone();
        cellphone2.setSim(sim2);
        cellphone2.setEarphones(inalambric);
        cellphone2.setCellphoneCase(phoneCase);

        Cellphone cellphone3 = (Cellphone) template.clone();
        cellphone3.setSim(sim3);
        cellphone3.setCellphoneCase(phoneCase);
        cellphone3.setCharger(phoneCharger);

        cellphone1.showCellphoneInfo();
        cellphone2.showCellphoneInfo();
        cellphone3.showCellphoneInfo();

    }
}
