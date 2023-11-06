package algorithms.homework2;

public class Main {
    public static void main(String[] args) {

    }

    class HeapSort {
        public static void sort(int[] array) {
            for (int i = array.length / 2 - 1; i >= 0 ; i--) {
                heapify(array, array.length, i);
            }

            for (int i = array.length - 1; i >= 0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                heapify(array, i, 0);
            }
        }

        private static void heapify(int[] array, int length, int index) {
            int largest = index;
            int left = index * 2 + 1;
            int right = index * 2 + 2;

            if (left < length && array[left] > array[largest]) {
                largest = left;
            }

            if (right < length && array[right] > array[largest]) {
                largest = right;
            }

            if (largest != index) {
                int temp = array[index];
                array[index] = array[largest];
                array[largest] = temp;

                heapify(array, length, largest);
            }

        }
    }
}
