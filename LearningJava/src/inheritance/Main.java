package inheritance;

public class Main {
    public static void main(String[] args) {

//        Box cube = new Box(6);
//        Box cuboid = new Box(1,2,3);
//        cuboid.show();

//        Cube c = new Cube(6);
//        Cube c2 = new Cube(c);
//        System.out.println(c2 + ", Area:" + c2.getArea() + ", Volume:" + c2.getVolume());

        // Parent class object can be initialized with child class constructor
//        Box b1 = new Cube(2);
//        System.out.println(b1);

        //Can't initialize child object with parent class constructor, as variables in
        //child class can't be initialized as parent object can't access child class
        //components
        //Cube c1 = new Box(2);


        // Multi-Level Inheritance
//        PackageBox p1 = new PackageBox(5,true);
//        System.out.println(p1);
//        p1.showBox();
//        p1.showPackageBox();



    }
}
