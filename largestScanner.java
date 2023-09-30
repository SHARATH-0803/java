import java.util.Scanner;

public class largestScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Enter number" +(i+1)+ ":");
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for (int i = 1; i<n; i++){

            if (numbers[i]>max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is: " +max);
    }
}
