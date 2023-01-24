public class Task11 {
    public static void main(String[] args){

        //Write a program to print out duplicate elements from an Array of Strings?

        String[] array = {"apple","orange","lemon","lime","lime","cherries"};

        for (int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length; j++){
                if((array[i].equals(array[j])) && (i != j) ) {
                    System.out.println("Duplicate Element is "+array[j]);
                }
            }
        }
    }
}
