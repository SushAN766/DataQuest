//https://leetcode.com/problems/missing-number/

public class MissingNumber{
    public static void main (String[] args){
        int nums[]={3,0,1};
        System.out.println(missingNumber(nums));

    }
    public static int missingNumber (int nums[]){
        int sum=0;
        int n=nums.length;
        for (int i=0;i<n;i++){
            
            sum=sum+nums[i];

        }
        int actualSum=(n*(n+1))/2;
        int missingnum=actualSum-sum;

        return missingnum;

    }
}