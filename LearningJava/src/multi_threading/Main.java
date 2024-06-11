package multi_threading;

public class Main {
    public static void main(String[] args) {

        //Threads can be created by extending Thread class or by implementing Runnable interface

        // By Thread class
        Threads t1 = new Threads(123);
        t1.start();

        // By Runnable interface
        Runnables r1 = new Runnables();
        r1.run();


    }
}
