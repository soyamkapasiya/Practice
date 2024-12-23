package dops160;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr){
        int first = 0;
        int last = arr.length-1;

        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}
