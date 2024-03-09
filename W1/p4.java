package W1;

public class p4 {

    public static int sum(int[]A, int x){
        int sum = 0;
        for (int i = 0; i <= x; i++){
            sum += A[i];
        }
        return sum;
    }

    public static int sumRange(int[] A, int left, int right){
        return sum(A, right) - sum(A, left) + A[left];
    }
    
    public static void main(String[] args) {
        int [] A = {6, 2, 9, 8, 5, 4, 3};
        int [] first = {0,6,0,3};
        int [] second = {0,6,6,4};

        for (int i = 0; i < first.length; i++){
            System.out.printf("sumRange(%d, %d): %d" ,first[i], second[i],sumRange(A, first[i], second[i]));
            System.out.println("\n");
        }

        // System.out.println(sumRange(A, 0, 6));
    }
}
