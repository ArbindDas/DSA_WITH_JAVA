package DSA.Basics;

import java.util.ArrayList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        List<String>strings = new ArrayList<>();


        strings.add("Deposited : 600  new balance 600");
        strings.add("Deposited : 900  new balance 800");


        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
    }
}
