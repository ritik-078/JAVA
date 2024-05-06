package interfaces;

import access.A;

public class Main {
    public static void main(String[] args){
//        Car Maruti = new Car();
//        Maruti.start();
//        Maruti.acc();
//        Maruti.brake();
//        Maruti.stop();


        Engine eng = new PowerEngine();
        Engine eng2 = new ElectricEngine();
        NiceCar Audi = new NiceCar(eng);
        Audi.start();
        Audi.stop();
        Audi.acc();
        Audi.startMusic();
        Audi.stopMusic();
        Audi.changeEngine(eng2);
        Audi.start();
        Audi.stop();
        Audi.acc();
    }
}
