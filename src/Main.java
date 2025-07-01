import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void arraySummary(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int sum = 0;
        boolean containsEven = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] % 2 == 0) {
                containsEven = true;
            }
            sum += arr[i];
        }

        System.out.println("Reversed: " + Arrays.toString(arr));
        System.out.println("Min: " + minValue);
        System.out.println("Max: " + maxValue);
        System.out.println("Sum: " + sum);
        System.out.println("Contains even: " + containsEven);
    }

    public static void reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");

        for (String word : words) {
            result.append((new StringBuilder(word)).reverse() + " ");
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Original: " + Arrays.toString(arr));
        arraySummary(arr);

        System.out.println("Enter a sentence: ");
        reverseWords(scanner.nextLine());

        scanner.close();
    }
}
