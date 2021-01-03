package fundamentals.firstOptionalTask;

public class MinAndMaxLength {
    public static void main(String[] args) {
        int[] numbers = NumberGetter.getNumbers();
        NumberProcessor.printMinAndMaxValues(numbers);
    }
}
