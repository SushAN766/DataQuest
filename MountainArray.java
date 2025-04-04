//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        int peakIndex =peakIndexInMountainArray (arr);
        System.out.println("Peak Index:"+peakIndex);
    }
    
    public static int peakIndexInMountainArray (int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}