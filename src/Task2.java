import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        //Using Scanner, create an array of countries. When an array is created, retrieve all
        // values from it and while retrieving those values print capital for each country. (Use 2 different loops)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of countries ");
        int c = scanner.nextInt();
        String[] countries = new String[c];
        System.out.println("Enter the countries");
        for (int i = 0; i < c; i++){
            countries[i] = scanner.next();
        }

        String[] capitals = new String[c];
        for (int i = 0; i < c; i++) {
            switch (countries[i]){
                case "USA":
                    capitals[i] = "Washington D.C";
                    break;
                case "South Korea":
                    capitals[i] = "Seoul";
                    break;
                case "France":
                    capitals[i] = "Paris";
                    break;
                case "England":
                    capitals[i] = "London";
                    break;
                case "China":
                    capitals[i] = "Beijing";
                    break;
                case "Japan":
                    capitals[i] = "Tokyo";
                    break;
                default:
                    capitals[i] = "unknown";
            }
        }

        for (int i =0; i < c; i++){
            System.out.println("The capital of "+ countries[i] +" is "+ capitals[i]);
        }
    }
}
