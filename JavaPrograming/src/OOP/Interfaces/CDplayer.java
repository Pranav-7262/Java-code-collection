package OOP.Interfaces;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("start the media");
    }

    @Override
    public void stop() {
        System.out.println("stop the media");
    }
}
