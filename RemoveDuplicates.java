//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicates{
    public static void main (String[]  args){
        int nums[]={1,1,2};
        System.out.println(removeDuplicates(nums));//Output=2 

    }
    public static int removeDuplicates(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[i]=nums[count];
                count++;
            }
        }
        return count;
    }
}