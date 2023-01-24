public class Task6 {

    public static void main(String[] args){

        // Write a program to swap 2 numbers without a temporary variable?
        int num1 = 10, num2 = 5;

        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("After swapping num1 = "+ num1+ " num2 =" +num2);
    }
}
