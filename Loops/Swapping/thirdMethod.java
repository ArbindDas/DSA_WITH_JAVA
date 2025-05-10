package DSA.Loops.Swapping;

public class thirdMethod
{
    public static void main(String[] args) {

        int a = 100 , b = 200;
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
