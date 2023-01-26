class Pen{
    String color;
    String type;

    public void workOfPen(){
        System.out.println("Writing something!");
    }

    public void display(){
        System.out.println(this.color);
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Parametrized Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class OOPs_1_Constructors {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball point";

        pen1.workOfPen();
        pen2.workOfPen();

        pen1.display();
        pen2.display();

	
	/*Student student1 = new Student();
	student1.name = "Shradha Khapra";
	student1.age = 22;*/

        Student student1 = new Student("Shradha Khapra", 22);
        student1.studentInfo();
    }
}