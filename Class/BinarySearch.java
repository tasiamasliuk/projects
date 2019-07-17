import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
    public static int rank (int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4, 18, 0, 3, 5, 6, 1, 2, 12};
        Arrays.sort(array);

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        if (rank(key,array) < 0)
            System.out.println("There is no such element (" + key + ") in the array");
    }
}
