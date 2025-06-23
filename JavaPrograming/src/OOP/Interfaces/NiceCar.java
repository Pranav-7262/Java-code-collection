package OOP.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();

    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startmusic(){
        player.start();
    }
    public void stopmusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
