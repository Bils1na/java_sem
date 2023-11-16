package algorithms.lecture2;

public class Find {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5};

        System.out.println(find(numbers, 5));
        System.out.println(binaryFind(numbers, 5, 0, numbers.length - 1));
        
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryFind(int[] array, int value, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        
        if (array[midPoint] < value) {
            return binaryFind(array, value, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return binaryFind(array, value, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }
    }
}