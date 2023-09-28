import java.util.Scanner;

public class Poww {
    public static void main(String[] args){
        double a, b, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: " );
        a = sc.nextInt();
        System.out.println("Enter number b: ");
        b = sc.nextInt();
        result = Math.pow(a+b, 2);
        System.out.println("Power of sum of " + a + " and " + b + " is " +result);
    }
}
