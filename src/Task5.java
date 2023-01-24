public class Task5 {
    public static void main(String[] args){

        /*
        Create a 2D array of integers. Develop a program that will calculate the sum of even and odd numbers for that array.
         */
        int[][] matrix={{7,9,13},
                        {18,21,24},
                        {26,34,30},
        };
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 2 == 0){
                    evenSum += matrix[i][j];
                }else {
                    oddSum += matrix[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers " +evenSum);
        System.out.println("The sum of odd numbers " +oddSum);

    }
}
