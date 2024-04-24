package W8;

public class P3 {
    public static int inversionCount(int[] arr){
        int count= 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length-1; j > i ;j--){
                if(i < j && arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={3,2,1};

        System.out.println(inversionCount(arr));
    }
}
