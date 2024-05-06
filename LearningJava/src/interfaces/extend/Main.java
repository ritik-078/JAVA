package interfaces.extend;

public class Main implements A,B{
    //When one interface extend another interface and we implement interface(that
    // extends another interface), we have to define the methods in the both the
    // interfaces
    @Override
    public void greeting2() {
        System.out.println("Greeting");
    }

    @Override
    public void greeting() {
        System.out.println("Greeting 2");
    }

    public static void main(String[] args){

    }
}
