public class SortLargeDataEfficiently {
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n < 2){
            return;
        }
        int mid = n/2;
        int [] left = new int[mid];
        int [] right = new int[n-mid];

        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }

        for(int i=mid; i<n; i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right,mid,n-mid);
    }

    public static void merge(int[] arr,int[] left,int[] right,int l,int r){
        int i=0,j=0,k=0;

        while(i<l && j<r){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i<l){
            arr[k++] = left[i++];
        }
        while(j<r){
            arr[k++] = right[j++];
        }
    }

    public static void bubbleSort(int[] arr){
        long startTime = System.nanoTime();

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total Time in BubbleSort : " + totalTime);
    }

    public static void main(String[] args) {
        int [] arr = {8,7,6,5,9,6,5,4,2,1,21,44,4,5,6,4,3,2,5,4,2,2,3,4,6,6,4,7,9,9,8,7,5,54,5,6,7,4};

        long startTime = System.nanoTime();
        mergeSort(arr);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total time in MergeSort: " + totalTime);

        bubbleSort(arr);
    }
}

//Total time in MergeSort: 66900
//Total Time in BubbleSort : 35900
