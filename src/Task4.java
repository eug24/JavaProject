public class Task4 {
    public static void main(String[] args){

       /* Create a 2D array of integer types where you will store odd and even numbers.
        Develop a program that will identify/print the even numbers only.
        */

        int [][] martrix = {{3,7,2},
                        {13,15,18},
                        {22,23,28},

        };
        System.out.println("Even numbers in the 2D arrays are ");
        for (int i = 0; i< martrix.length; i++){
            for (int j = 0; j < martrix[i].length; j++) {
                if(martrix[i][j]%2==0){
                    System.out.println(martrix[i][j]+" ");
                }
            }
        }
    }
}
