package dops160;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void pushZerosToEnd(int[] arr) {
        int firstZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != firstZero) {
                    arr[firstZero] = arr[i];
                    arr[i] = 0;
                }
                firstZero++;
            }
        }
    }
}
