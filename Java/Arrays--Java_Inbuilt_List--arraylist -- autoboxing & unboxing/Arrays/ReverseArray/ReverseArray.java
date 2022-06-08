import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the no. of elements in the Array :");
        int turn = scanner.nextInt();
        int[] array = new int[turn];
        System.out.println("Enter "+ turn +" elements one by one");
        for (int i =0; i<turn; i++) {
            array[i] = scanner.nextInt();
        }
        reverse(array);
    }

    private static void reverse (int[] array) {

        System.out.println(">> The Entered Array -> " + Arrays.toString(array));
        int maxValueIndex = array.length - 1;
        int halfArray = array.length / 2;
        for (int i=0; i< halfArray; i++) {
            int temp = array[i];
            array[i] = array[maxValueIndex - i];
            array[maxValueIndex-i] = temp;
        }
        System.out.println(">> reversed Array ->  " + Arrays.toString(array));
    }
}
