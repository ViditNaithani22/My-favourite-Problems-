package common_java_problems.RunningSumOf1Darray;

import java.util.Arrays;
import java.util.Scanner;

public class solution1 {
    public static int[] runningSum(int[] nums) {
        int[]  results = new int[nums.length];
        results[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            results[i] = nums[i]+results[i-1];
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter length of input array:");
        int length = scan.nextInt();
        System.out.println("enter elements of input array:");
        int[] input = new int[length];
        for (int i = 0; i<length;i++){
            input[i] = scan.nextInt();
        }

        System.out.println("input array: "+Arrays.toString(input));

        int[] result = runningSum(input);

        System.out.println("output array: "+Arrays.toString(result));


    }
}
