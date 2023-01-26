class Student2{
    String name;
    static String schoolName;
/* here we made school name as static because here school name will be same for every student of that 
school. */
}
public class OOPs_7_Static_Keyword{
    public static void main(String[] args){
        Student2.schoolName = "KVNCA";
// here we access static variable schoolName to assign value directly by using its class name.
        Student2 student1 = new Student2();
        student1.name = "Shradha Khalpar";
        System.out.println(student1.schoolName+" "+student1.name);
    }
}