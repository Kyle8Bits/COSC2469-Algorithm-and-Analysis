package W7;

public class p1 {
    
    public static void main(String[] args) {
        int[] arr = {0,5,3,6,2,1};

        for (int i = 0; i < selectionSort(arr).length; i++){
            System.out.println(selectionSort(arr)[i]);
        }
    }
    
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

}