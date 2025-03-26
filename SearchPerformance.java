import java.util.*;

public class SearchPerformance {

    public static boolean linearSearch(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Search Performance Test");

        int[] array = new int[1000000];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 1000000; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long startTime = System.nanoTime();
        linearSearch(array, 99999);
        long time1 = System.nanoTime() - startTime;
        System.out.println("Time taken using Array (Linear Search): " + time1 + " ns");

        startTime = System.nanoTime();
        hashSet.contains(99999);
        long time2 = System.nanoTime() - startTime;
        System.out.println("Time taken using HashSet (O(1)): " + time2 + " ns");

        startTime = System.nanoTime();
        treeSet.contains(99999);
        long time3 = System.nanoTime() - startTime;
        System.out.println("Time taken using TreeSet (O(log N)): " + time3 + " ns");
    }


}

//Search Performance Test
//Time taken using Array (Linear Search): 4113100 ns
//Time taken using HashSet (O(1)): 13200 ns
//Time taken using TreeSet (O(log N)): 164400 ns
