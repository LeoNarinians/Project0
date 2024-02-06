
import java.util.Scanner;

public class Assignment4{
    public static void main (String[]args){
        int number = 0, max = 0, min = 100000, count = 0, sum = 0;
        double average;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a positive integer. Enter -1 to quit.");
            number = scanner.nextInt();
            
            if (number != -1){
                if(isPrime(number)){
                    System.out.println("The number " + number + " is a prime number.\n");
                }

                else{
                    System.out.println("The number " + number + " is not a prime number.\n");
                }

                count += 1;
                sum += number;

                if (number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }
            }
            
        }while(number != -1);

        average = average(sum, count);

        System.out.println("\nThe maximum positive number is: " + max);
        System.out.println("The minimum positive number is: " + min);
        System.out.println("The sum is: " + sum);
        System.out.println("The count of number(s) is: " + count);
        System.out.printf("The average is: %.2f", average);
        scanner.close();
    }

    public static boolean isPrime(int num){
        boolean prime = true;
        for(int i = 2; i <= num/2; i++){
            if (num % i == 0){
                prime = false;
            }

        }

        if(num == 1){
                prime = false;
        }
        
        return prime;
    }

    public static double average(int sum, int count){
        double average;

        average = (double) sum / count;

        return average;
    }
}