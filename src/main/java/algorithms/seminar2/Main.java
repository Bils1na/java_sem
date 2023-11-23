//package algorithms.seminar2;
//
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = new int[10000];
//        Random rnd = new Random();
//
//        for (int i = 0; i < numbers.length; i++) {
//            array[i] = rnd.nextInt(10000);
//        }
//        long start = System.currentTimeMillis();
//        bubbleSort(numbers);
//        System.out.println(System.currentTimeMillis() - start);
//
//        for (int i = 0; i < numbers.length; i++) {
//            array[i] = rnd.nextInt(10000);
//        }
//        start = System.currentTimeMillis();
//        quickSort(numbers, 0 ,numbers.length - 1);
//        System.out.println(System.currentTimeMillis() - start);
//
//    }
//
//    public static void bubbleSort(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length; j++) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//    }
//
//    public static void quickSort(int[] array, int start, int end) {
//		if (array.length == 0) {
//			return;
//		}
//
//		if (start >= end) {
//			return;
//		}
//
//		int left = start;
//		int right = end;
//		int pivot = array[(end - start) / 2 + start];
//
//		while (left <= right) {
//			while (array[left] < pivot) {
//				left++;
//			}
//			while (array[right] > pivot) {
//				right--;
//			}
//			if (left <= right) {
//				int temp = array[left];
//				array[left] = array[right];
//				array[right] = temp;
//
//				left++;
//				right--;
//			}
//		}
//
//		if (left < end) {
//			quickSort(array, start, right);
//		}
//
//		if (end > left) {
//			quickSort(array, left, end);
//		}
//	}
//
//    public static int binarySearch(int[] array, int value, int min, int max) {
//        // int midPoint;
//        // if (max < min) {
//        //     return -1;
//        // } else {
//        //     midPoint = (max - min) / 2 + min;
//        // }
//
//        // if (array[midPoint] < value) {
//        //     return binarySearch(array, value, midPoint + 1, max);
//        // } else if (array[midPoint] > value) {
//        //     return binarySearch(array, value, min, midPoint - 1);
//        // } else {
//        //     return midPoint;
//        // }
//        int left = 0;
//        int right = array.length;
//        int index = -1;
//
//        while(left <= right) {
//            int midPoint = (right - left) / 2 + left;
//            if (array[midPoint] < value) {
//                left = midPoint + 1;
//            } else if (array[midPoint] > value) {
//                right = midPoint - 1;
//            } else if (array[midPoint] == value) {
//                index = midPoint;
//                break;
//            }
//        }
//
//        return index;
//    }
//}