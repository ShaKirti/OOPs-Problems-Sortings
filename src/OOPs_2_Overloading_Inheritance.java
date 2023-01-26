class Students{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name +" "+age);
    }
}

// Inheritance example
class Shape{
    String color;
    int price;
}
class Pens extends Shape{

}
public class OOPs_2_Overloading_Inheritance{
    public static void main(String[] args){
        Students student1 = new Students();
        student1.name = "Shradha Khalapr";
        student1.age = 22;

        student1.printInfo(student1.name);
        student1.printInfo(student1.age);
        student1.printInfo(student1.name,student1.age);


        Pens pen1 = new Pens();
        pen1.color = "Blue";
        pen1.price = 10;
        System.out.println(pen1.color+" "+pen1.price);
    }
}