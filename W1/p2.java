package W1;

public class p2 {
    public static int missingValue(int[] A){
        int sum = (5*6)/2;
        for (int i = 0; i < A.length; i++){
            sum -= A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println("The missing number: " + missingValue(A));
    }
}
