import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        // Write a java program to check whether a given number is prime or not?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scanner.nextInt();

        if(isPrime(num)){
            System.out.println(num +" is a prime number");
        }else {
            System.out.println(num + "is not a prime number");
        }
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if((num%i)==0)
                return false;
        }
        return true;
    }
}
