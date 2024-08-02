import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArr = getIntegers(5);
        sortIntegers(myArr);
        printArray(sortIntegers(myArr));
    }

    public static int[] getIntegers(int size) {
        if (size > 0) {
            int[] arr = new int[size];
            Scanner s = new Scanner(System.in);

            for(int i = 0; i < size; i++) {
                 System.out.print("Input array element (int): ");
                arr[i] = Integer.parseInt(s.nextLine());
            }
        }

        return new int[0];
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        Arrays.sort(arr);
        int[] myCopiedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            myCopiedArr[arr.length - i - 1] = arr[i];
        }

        return myCopiedArr;
    }
}
