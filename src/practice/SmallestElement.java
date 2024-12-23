package practice;

public class SmallestElement {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(smallestElement(arr));
    }

    public static int smallestElement(int[] arr){
        if (arr.length == 0) {
            return -1;
        }
        int max = Integer.MAX_VALUE;

        for (int ele : arr){
            if(ele < max)
                max = ele;
        }
        return max;
    }

}
