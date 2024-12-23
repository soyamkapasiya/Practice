package practice;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;

        for (int ele : arr){
            if(ele > max)
                max = ele;
        }

        return max;
    }
}
