package DSA.ConditionalStatement.IfElse;

public class NestedGreatest
{
    public static void main(String[] args) {
        isNestedGreatest(1,2,3);
    }
    public static void isNestedGreatest(int num1, int num2 , int num3){
        if (num1>num2){
            if (num1>num3){
                System.out.println("the "+num1 + " is the greatest : ");
            }else {
                System.out.println(num3 + "is the greatest : ");
            }
        }
        else {
            if (num2>num3){
                System.out.println(num2 + "is the greatest : ");
            }else {
                System.out.println(num3 + "is the greatest : ");
            }
        }

    }
}
