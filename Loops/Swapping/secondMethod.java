package DSA.Loops.Swapping;

public class secondMethod
{
    public static void main(String[] args) {
        int a = 10 , b = 100;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
