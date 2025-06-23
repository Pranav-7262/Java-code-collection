package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car=  new Car();
////        car.start();
////        car.acc();
////        car.brake();
////        car.stop();
//        Media carmedia = new Car();
//        carmedia.start();
//        carmedia.stop();
//
//        Brake brake = new Car();
//        brake.brake();
//        brake.start();
        NiceCar car = new NiceCar();
        car.start();
        car.stopmusic();
        car.startmusic();
        car.upgradeEngine();
        car.start();
        car.stop();
        ///interfaces are extends
    }
}
