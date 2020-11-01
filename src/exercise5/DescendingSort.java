package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
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
          int maxindex = i;
          for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[maxindex] < numbers[j]) {
              maxindex = j;
            }
          }
          int temp = numbers[maxindex];
          numbers[maxindex] = numbers[i];
          numbers[i] = temp;
        }
                                 

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
