import java.util.ArrayList;
import java.util.Collections;

public class DataStructure_1_ArrayList{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        // To add new elements
        list.add(10);
        list.add(12);
        list.add(15);
        //To print arraList
        System.out.println(list);

        //To get elements
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        // To add element in between
        list.add(1,15);
        System.out.println(list);

        //To set element-> kisi index pr pehle se hi koi value hai , usko change krna hai.
        list.set(2,26);
        System.out.println(list);

        //To delete element at given position
        list.remove(3);
        System.out.println(list);


        System.out.println(list.size());

        //Loops in arrayList
        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println(" ");

        //Sorting in arrayList
        Collections.sort(list);
        System.out.println(list);
    }
}