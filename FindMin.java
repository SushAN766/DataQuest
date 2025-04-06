

public class FindMin {
    public static void main(String args[]) {
        
        int[] arr = {3,4,5,1,2};
        int a = findmin(arr);
        System.out.println(a); //output=1
        
    }

    public static int findmin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE; 
        }
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < a) {
                a = arr[i];
            }
        }
        return a;
    }
}