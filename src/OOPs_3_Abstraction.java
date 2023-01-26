abstract class Animals{
    abstract void walk();  //abstract method doesn't required any body.
    public void eats(){
        System.out.println("Animal eats");
    }
}
class Horses extends Animals{
    public void walk(){   //here we are giving the body to the abstract method "walk()".
        System.out.println("walks on 4 legs.");
    }
}
class Cows extends Animal{
    public void walk(){   //here we are giving the body to the abstract method "walk()".
        System.out.println("walks on 4 legs.");
    }
}

public class OOPs_3_Abstraction{
    public static void main(String[] args){
        Horses horse = new Horses();
        horse.walk();
        horse.eats();

        Cows cow = new Cows();
        cow.walk();
        cow.eats();
    }
}