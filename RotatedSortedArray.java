//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedSortedArray{
    public static void main (String[] args){
        RotatedSortedArray searcher=new RotatedSortedArray();
        int arr[]={5,1,3};
        int target=3;
        System.out.println(searcher.search(arr,target));  // Output: 2
    }

    public int search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[left]<=arr[mid])
            {
                if(arr[left] <= target && target < arr[mid])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(arr[right] >= target && target > arr[mid])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    
}