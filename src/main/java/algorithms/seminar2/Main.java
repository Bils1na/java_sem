package algorithms.seminar2;

public class Main {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array, int start, int end) {
// 		if (array.length == 0) {
// 			return;
// 		}

// 		if (start >= end) {
// 			return;
// 		}
		
		int left = start;
		int right = end;
		int pivot = array[(end - start) / 2 + start];

		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;			
				
				left++;
				right--;
			}
		} 
		
		if (left < end) {
			quickSort(array, start, right);
		}

		if (end > left) {
			quickSort(array, left, end);
		}
	}
}