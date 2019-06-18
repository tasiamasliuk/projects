import java.util.Random;

public class Solution {
    // Returns a random real number uniformly in [0, 1).
    public static double rand(){
        Random stdRandom = new Random();
        return 0 + stdRandom.nextDouble() * (1-0);
    }

    //O(n) and space O(1) for swap
    public static void reorder(int[] arr){
        int n = arr.length;
        for (int i = n-1; i > 1; i--) {
            int pick = (int)Math.floor((i+1) * rand());
            int temp = arr[i];
            arr[i] = arr[pick];
            arr[pick] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {4,58,0,-4,12,15,0};
        reorder(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int[] array1 = {4,0,13,-98};
        reorder(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
