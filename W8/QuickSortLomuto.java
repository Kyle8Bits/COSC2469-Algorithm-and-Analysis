package W8;

class QuickSortLomuto {
    // sort with quick sort
    public void quickSort(int arr[], int left, int right) {
      if (left < right) {
        try {
          int p = partition(arr,left,right);
          quickSort(arr,left,p-1);
          quickSort(arr,p+1,right);
        } catch (Exception e) {
          e.printStackTrace();
          System.exit(0);
        }
      }
    }
  
    // Lomuto partition
    // Return a partition point p
    // Where all elements arr[left, p - 1] <= arr[p] <= all elements arr[p + 1, right]
    public int partition(int arr[], int left, int right) {
      int p = arr[right];  // select the right-most element as pivot
      int i = left;
      for (int j = left; j < right; j++) {
        if (arr[j] <= p) {
          // swap
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
  
          // increase i
          i++;
        }
      }
      // swap
      int tmp = arr[i];
      arr[i] = arr[right];
      arr[right] = tmp;
  
      return i;
    }
  }