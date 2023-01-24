public class Task3 {
    public static void main(String [] args){

        // Create a 2D array of integer values. Print the sum of all numbers.

        int [][] matrix ={{10,20,30},
                          {35,45,55},
                          {25,15,5},

        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                sum +=matrix[i][j];
            }
        }
        System.out.println("Sum of all the numbers in 2D array is "+ sum);

    }
}
