package java1.staticExample;

public class Human {
    int age;
    String name;
    public static int population=0;

    public Human(int age, String name){
        this.name = name;
        this.age = age;
        population++;
    }
}
