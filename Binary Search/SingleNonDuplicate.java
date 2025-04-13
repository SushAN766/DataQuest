//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleNonDuplicate{
    public static void main (String[] args){
        int nums[]={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));//output=2
    }
    public static int singleNonDuplicate(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(mid % 2==1){
                mid--;
            }
            if(nums[mid]!=nums[mid+1]){
                right=mid;

            }
            else{
                left=mid+2;
            }
        }
        return nums[left];
    }
}
