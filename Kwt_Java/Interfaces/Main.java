package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();

//        car.start();
//        car.stop();
//        car.acc();

//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
