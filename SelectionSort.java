//Selection Sort

public class SelectionSort{
    public static void main (String[] args){
        int arr[]={9,1,8,2,7,3,6,4,5};
        selectionSort(arr);
        for (int i : arr)
        {
            System.out.println(i);
        }

    }
    private static void selectionSort(int[] arr){
        for(int i = 0;i <arr.length-1;i++)
        {
            int min = i;

            for(int j = i+1 ;j<arr.length; j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
        
        int temp =  arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        }
    }
}