package W5;

public class p1 {

    static int[] generate(int size, int max_value){
        int[] arr = new int[size];
        for (int i =0; i < size; i++){
            arr[i] = (int) (Math.random() * max_value + 1);
        }

        return arr;
    }

    static int[] countingSort(int[] arr, int max_value){
        int[] freg = new int[max_value+1];
        int[] res = new int[arr.length];

        //frequency countiing
        for(int i = 0; i < arr.length; i++){
            freg[arr[i]]++;
        }

        //cumulative
        for (int i = 1; i <= max_value; i++){
            freg[i] +=  freg[i-1];
        }
        
        for (int i = arr.length-1; i >= 0; i--){
            res[freg[arr[i]]-1] = arr[i];
            freg[arr[i]]--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[]test = generate(10,20);
        int[] res = countingSort(test, 20);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + ", ");
        }

    }
}
