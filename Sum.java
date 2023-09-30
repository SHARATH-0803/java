import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of number : ");
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Enter number " +(i+1)+ ": ");
            number[i] = sc.nextInt();
        }
        int largest = number[0];
        int smallest = number[0];
        for (int element : number){
            if (element > largest){
                largest = element;
            }
            if (element < smallest){
                smallest = element;
            }

        }
        int result = largest + smallest;
        System.out.println("Sum of smallest and largest number is " +result);

    }
}
