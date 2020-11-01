package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        int counter = 0;
        int[] uniqueNumbers = new int[numbers.length];
       for (int index = 0; index < numbers.length; index++) {
         boolean foundnumber = false;
         for(int i = 0; i < uniqueNumbers.length; i++) {
          if(numbers[index] == uniqueNumbers[i]) {
            foundnumber = true;
          }
        }
          if (foundnumber == false) {
          uniqueNumbers[counter] = numbers[index];
          counter++;
          }



       }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
