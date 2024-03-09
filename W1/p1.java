package W1;

public class p1 {
    public static int findLargest(int[] A){
        int largest = A[0];
        for (int i = 1; i < A.length; i++){
            if (largest < A[i]){
                largest = A[i];
            }
        }
        return largest;
    }

    public static int findSecLargest(int[] A){
        int largest = A[0];
        int sec_largest = 0;
        for (int i = 1; i < A.length; i++){
            if (largest < A[i]){
                sec_largest = largest;
                largest = A[i];
            }
        }

        return sec_largest;
    }

    public static void main (String[] args){
        int[] A = {7, 6, 9, 3, 2, 5};

        System.out.println(findLargest(A));
        
        System.out.println(findSecLargest(A));
    }
}
