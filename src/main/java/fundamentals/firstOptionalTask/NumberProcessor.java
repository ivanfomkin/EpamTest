package fundamentals.firstOptionalTask;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumberProcessor {
    public static int getNumberLength(int number) {
        return String.valueOf(number).length();
    }

    public static void printMinAndMaxValues(int[] array) {
        Map<Integer, Integer> map = getSizeMapFromArray(array);
        int minLength = map.get(array[0]);
        int numberWithMaxLength = array[0];
        int numberWithMinLength = array[0];
        int maxLength = map.get(array[0]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minLength) {
                minLength = entry.getValue();
                numberWithMinLength = entry.getKey();
            }
            if (entry.getValue() > maxLength) {
                maxLength = entry.getValue();
                numberWithMaxLength = entry.getKey();
            }
        }
        System.out.println("Max length is " + maxLength + " has number: " + numberWithMaxLength);
        System.out.println("Min length is " + minLength + " has number: " + numberWithMinLength);
    }

    private static Map<Integer, Integer> getSizeMapFromArray(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], getNumberLength(array[i]));
        }
        return map;
    }

    public static void printByLength(int[] array) {
        Map<Integer, Integer> map = getSizeMapFromArray(array);
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
