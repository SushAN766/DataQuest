https://leetcode.com/problems/longest-mountain-in-array/description/


public class LongestMountainArray{
    public static void main (String[] args){
        int arr[] ={2,1,4,7,3,2,5};
        int a=longestMountain(arr);
        System.out.println(a);
    }
    public static int longestMountain(int[] arr){
        int longestMountain=0;
        int n= arr.length-1;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1] < arr[i] && arr[i+1] < arr[i])
            {
                int left=i-1;
                int right =i+1;
                while(left > 0 && arr[left-1] < arr[left])
                {
                    left--;
                }
                while(right < n && arr[right + 1]< arr[right])
                {
                    right++;

                }
                longestMountain= Math.max(longestMountain,(right-left+1));
            }

        }
        return longestMountain;
    }
}