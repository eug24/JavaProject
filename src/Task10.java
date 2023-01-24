public class Task10 {

    public static void main(String[] args){

        // Wrote a java program to find the second largest number in the array?

        int [] matrix={18,23,55,78,97,87};
        int largest = matrix[0];
        int secondLargest = matrix[0];

        System.out.println("This group of array ");
        for(int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i]+" ");
        }

        for (int i = 0; i < matrix.length; i++){

            if (matrix[i] > largest) {
                secondLargest = largest;
                largest = matrix[i];
            } else if (matrix[i]>largest) {
                secondLargest = matrix[i];
            }
        }

        System.out.println(" Second largest number is "+secondLargest);
    }
}
