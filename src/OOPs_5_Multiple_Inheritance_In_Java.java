interface Animal2{
    void eats();
}
interface Herbivore{
    void eats();
}
class Horse2 implements Animal2,Herbivore{
    public void eats(){
        System.out.println("Horse eats nuts.");
    }
}
public class OOPs_5_Multiple_Inheritance_In_Java {
    public static void main(String[] args){
        Horse2 horse = new Horse2();
        horse.eats();
    }
}