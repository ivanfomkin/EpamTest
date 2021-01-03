package fundamentals.firstOptionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGetter {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static int[] getNumbers() {
        int arraySize = 0;
        int[] array;
        try {
            arraySize = getArraySize();
            array = getArray(arraySize);
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int getArraySize() throws IOException {
        System.out.print("Enter count of numbers: ");
        return Integer.parseInt(bufferedReader.readLine());
    }

    private static int[] getArray(int size) throws IOException {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return array;
    }
}
