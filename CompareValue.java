package Compare;
import java.util.Scanner;//when we want to take system input we can import Scanner ,
public class CompareValue {
    public static void main(String[] args) {
        System.out.println("enter two number ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); int num2 = sc.nextInt();//compare two values can use if else statement.
        if(num1 >num2){//sc.nextInt() this sc object can take system input , but type must be same .
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num2 is greater than num1");
        }
    }
}
