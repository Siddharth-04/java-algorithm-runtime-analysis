public class SearchTargetInDataset {
    public static void linearSearch(int[] arr,int target){
        long startTime = System.nanoTime();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static void binarySearch(int[] arr,int target){
        int i=0 ;
        int j = arr.length-1;

        long startTime = System.nanoTime();

        while(i <= j){
            int mid = i + (j-i)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>target){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        linearSearch(arr,7);
        binarySearch(arr,7);
    }
}

//6
//272800
//6
//27900
