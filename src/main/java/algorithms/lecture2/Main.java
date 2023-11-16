package algorithms.lecture2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {4, 2, 1, 6, 8, 7, 0, 9, 3, 5};

        // bubbleSort(numbers);
        // directSort(numbers);
        insertSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static bubbleSort(int[] array) {
        boolean finish = true;
        do {
            for (int 1 = 0; i < array.length - 1; i++) {
                if (array[i] > array.[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        int left = start;
        int right = end;
        int pivot = array[(start + end) / 2];

        do {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
            }
            left++;
            right--;
        } while (left <= right);

        if (left < end) {
            
        }
    }
}