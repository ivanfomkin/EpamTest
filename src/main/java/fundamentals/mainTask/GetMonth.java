package fundamentals.mainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetMonth {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int enteredNumber = 0;
        System.out.print("Enter number: ");
        try {
            enteredNumber = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (enteredNumber > 0 && enteredNumber <= 12) {
            printMonthNameByNumber(enteredNumber);
        } else {
            System.out.println("Incorrect number");
        }
    }

    public static void printMonthNameByNumber(int number) {
        System.out.println(Month.of(number).getDisplayName(TextStyle.FULL_STANDALONE, new Locale("ru")));
    }
}
