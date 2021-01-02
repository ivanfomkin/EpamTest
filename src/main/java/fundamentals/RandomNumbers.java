package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumbers {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numbersCount = 0;
        while (numbersCount == 0) {
            System.out.print("Enter numbers count: ");
            try {
                numbersCount = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println("This is no integer number!");
                e.printStackTrace();
            }
        }
        System.out.print("Write 'yes' if you need to print all number from new line or something if you don't need them: ");
        boolean isNewLineNeed = false;
        try {
            isNewLineNeed= bufferedReader.readLine().equalsIgnoreCase("yes");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < numbersCount; i++) {
            printRandomNumber(isNewLineNeed);
        }
    }

    public static void printRandomNumber(boolean isNewLineNeed) {
        if (isNewLineNeed) {
            System.out.println(((int) (Math.random() * Integer.MAX_VALUE)));
        } else {
            System.out.print(((int) (Math.random() * Integer.MAX_VALUE)) + " ");
        }
    }
}