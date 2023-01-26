abstract class Animal{
    // abstract class "Animal" constructor
    Animal(){
        System.out.println("You are created an Animal Constructor.");
    }
    abstract void walk();  //abstract method doesn't required any body.
    public void eats(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    //Horse constructor
    Horse(){
        System.out.println("New horse constructor.");
    }
    public void walk(){   //here we are giving the body to the abstract method "walk()".
        System.out.println("horse walks on 4 legs.");
    }
}
class Cow extends Animal{
    Cow(){
        System.out.println("New Cow constructor.");
    }
    public void walk(){   //here we are giving the body to the abstract method "walk()".
        System.out.println("Cow goddess : Cow hamari mata hai. ");
    }
}

public class OOPs_6_Abstraction_With_Constructor {
    public static void main(String[] args){
        Horse horse = new Horse();
//        horse.walk();
//        horse.eats();

        Cow cow = new Cow();
//        cow.walk();
//        cow.eats();

       /* Animal animal = new Animal(); //Run-Time Exception==> java: Animal is abstract; cannot be instantiated
        animal.walk();*/
    }
}
