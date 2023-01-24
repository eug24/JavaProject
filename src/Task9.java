public class Task9 {

    public static void main(String[] args){

        // Maximum and minimum number in the array?
        int [] numbers={6,3,9,7,8,12,134,123,14,13,144,6900,265};

        int max=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println("The maximum number in this array is "+max);



        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min) {
                min=numbers[i];
            }

        }
        System.out.println("The mininum number in this array is "+min);

    }





}


