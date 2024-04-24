package W8;

class QuickSortHoare {
    // sort with quick sort
    public void quickSort(int arr[], int left, int right) {
      if (left < right) {
        int p = partition(arr,left,right);
        quickSort(arr,left, p);
        quickSort(arr,p+1,right);
      }
    }
  
    // Hoare partition
    // Return a partition point p
    // Where all elements arr[left, p] <= all elements arr[p + 1, right]
    public int partition(int arr[], int left, int right) {
      int p = arr[left];  // select the left-most element as pivot
      int front = left;
      int back = right;
      while (true) {
        while (arr[front] < p) {
          front++;
        }
        while (arr[back] > p) {
          back--;
        }
        if (front >= back) {
          return back;
        }
        // swapping
        int t = arr[front];
        arr[front] = arr[back];
        arr[back] = t;
        front++;
        back--;
      }
    }
}