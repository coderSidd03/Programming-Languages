import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = readInteger();
        int[] returnedArray = readElements(count);
        int returnedMin = findMin(returnedArray);
        System.out.println(">> the entered array is ->\t" + Arrays.toString(returnedArray));
        System.out.println(">> min element in the array -> " + returnedMin);
    }

    private static int readInteger () {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> enter the number of element needed for the array");
        int noOfElements = scanner.nextInt();
        return noOfElements;
    }

    private static int[] readElements (int count) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the " + count + " elements of the array : ");

        int[] array = new int[count];

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin (int[] array) {

        int min = array[0];

        for (int i=0; i< array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
