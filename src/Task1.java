import java.util.Scanner;
import java.util.Arrays;
public class Task1 {

    public static void main(String[] args){

        //Using Scanner, create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 4 numbers");

        int numbers= scanner.nextInt();
        int [] arr= new int[numbers];

        for (int i = 0; i < numbers; i++){
            arr[i]=scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            sum +=arr[i];
        }

        System.out.println("Sum of all the numbers in the array "+ sum);
    }
}
