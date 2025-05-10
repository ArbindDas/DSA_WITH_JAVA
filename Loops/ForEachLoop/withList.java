package DSA.Loops.ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class withList
{
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Arbind");
        stringList.add("ram");
        stringList.add("shyam");
        stringList.add("hari");

        for (String printval : stringList){
            System.out.println(printval);
        }


        List<Integer> integerList  = Arrays.asList(1,2,3,4,5);
        for (Integer print : integerList){
            System.out.println(print);
        }


        System.out.println();
        System.out.println();

        // Create an ArrayList from the original list (using Arrays.asList())

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8 , 7));
        list.add(100);



        for (Integer val : list){
            System.out.println(val);
        }
    }
}
