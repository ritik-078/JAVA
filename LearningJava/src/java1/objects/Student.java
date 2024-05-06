package java1.objects;

public class Student{
    int rollNo;
    String name;
    float marks;

    
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = 33.3f;
    }
    public Student(int rollNo, String name, float marks){
        //System.out.println(this);
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public Student(Student s){
        this(s.rollNo, s.name, s.marks);
    }
    public void showDetails()
    {
        System.out.println(this.rollNo);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
    public void update(int rollNo, String name, float marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void update(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public void update(String name)
    {
        this.name = name;
    }
    public void update(float marks)
    {
        this.marks = marks;
    }
    public char Grade(){
        if(marks>90)
            return 'A';
        else if(marks>80)
            return 'B';
        else if(marks>70)
            return 'C';
        else if(marks>60)
            return 'D';
        else
            return 'F';
    }
}