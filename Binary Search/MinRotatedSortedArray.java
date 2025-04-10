https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class MinRotatedSortedArray{
    public static void main(String[] args){
        int nums[]={4,5,6,7,0,1,2};
        int a=findMin(nums);
        System.out.println(a);
    }
   
    
    public static int findMin(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[right]) {
                
            left = mid + 1;
        } else {
                
            right = mid;
        }
    }

    return nums[left];
    }
}
