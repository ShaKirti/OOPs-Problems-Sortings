interface Animal1{
    void walk();
    /*void eats(){}   *It will throw an error because Interface ke andr hum log methods ke body ko
                define nhi kr skte.*/
    void eats();
}
class Horse1 implements Animal1{
    public void walk() {
        System.out.println("Horse walks with 4 legs.");
    }

    public void eats(){
        System.out.println("Horse eats nuts.");
    }
}
public class OOPs_4_Interfaces{
    public static void main(String[] args){
        Horse1 horse = new Horse1();
        horse.eats();
        horse.walk();
    }
}