import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Clone the array to keep the original intact
        int[] shuffledArray = originalArray.clone();

        // Shuffle the cloned array using Fisher-Yates shuffle
        fisherYatesShuffle(shuffledArray);

        System.out.print("Original Array: ");
        printArray(originalArray);
        System.out.print("Shuffled Array: ");
        printArray(shuffledArray);
    }

    public static void fisherYatesShuffle(int[] arr) {
        Random rand = new Random();
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
}
}