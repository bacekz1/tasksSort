import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {6, 15,654,6,54,65,4,65,4,654,654,6,54,65,4,6546, 5, 8};
        int[] arr2 = arr.clone();
        System.out.println(arr.length);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int smallest = arr[i];
            int smallestIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    smallestIndex = j;
                }
            }
            if (smallest != arr[i]) {
                arr[smallestIndex] = arr[i];
                arr[i] = smallest;
            }

            int biggest = arr[arr.length - 1 - i];
            int biggestIndex = arr.length - 1 - i;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > biggest) {
                    biggest = arr[j];
                    biggestIndex = j;
                }
            }
            if (biggest != arr[arr.length-1-i]) {
                arr[biggestIndex] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = biggest;
            }
        }
    }
}
