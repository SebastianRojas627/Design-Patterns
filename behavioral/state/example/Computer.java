package behavioral.state.example;

public class Computer {

    private IStateComputer stateComputer;
    private MemoriaRam memoriaRam;
    private TarjetaVideo tarjetaVideo;

    public Computer() {

        memoriaRam = new MemoriaRam();
        tarjetaVideo = new TarjetaVideo();
        tarjetaVideo.setCapacidadUtiliza(5).setCapacidadTotal("4g").setDescription("intel");
        memoriaRam.setCapacidadTotal("16g").setDescription("intel").setCapacidadUtiliza(5);
        stateComputer = new Apagado();
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public TarjetaVideo getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public IStateComputer getStateComputer() {
        return stateComputer;
    }

    public void setStateComputer(IStateComputer stateComputer) {
        this.stateComputer = stateComputer;
    }

    public void resourceManager() throws InterruptedException {
        stateComputer.resourceManager(this);
    }
}
