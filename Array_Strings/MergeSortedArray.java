//https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray{
    public void merge(int[] nums1,int[] nums2,int m,int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
    public static void main (String[] args){
        int nums1[]={1,2,3,0,0,0}, nums2[]={2,5,6};
        int m=3,n=3;
        new MergeSortedArray().merge(nums1,nums2,m,n);
        for (int i = 0; i < m + n; i++) {

            System.out.println(nums1[i]+"");
        }
    }
}