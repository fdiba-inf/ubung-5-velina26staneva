package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for(int i = 0; i < numbers.length - 1; i++) {
          int minindex = i;
          for (int j = i + 1; j < numbers.length; j++) {
            if(numbers[minindex] > numbers[j]) {
              minindex = j;
            }
          }
            int temp = numbers[minindex];
            numbers[minindex] = numbers[i];
            numbers[i] = temp;
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
