public class Solution {
    //Given an array of integers, return a new array such that each element at index i
    // of the new array is the product of all the numbers in the original array
    // except the one at i.
    
    public static int[] new_arrey(int[] arrey){
        int count = 0;
        int[] a = new int[arrey.length];
        for (int i = 0; i < arrey.length; i++) {
            a[i] = 1;
            for (int j = 0; j < arrey.length; j++) {
                count++;
                if (i!=j)
                    a[i] *= arrey[j];
            }
        }
        System.out.println("counter: " + count);
        return a;
    }

    public static int[] new_arrey2(int[] arrey){
        int count = 0;
        int[] a = new int[arrey.length];
        a[0] = 1;
        for (int i = 1; i < arrey.length; i++) {
            a[0] *= arrey[i];
            count++;
        }

        for (int i = 1; i < arrey.length; i++) {
            count++;
            a[i] = (a[i-1] / arrey[i]) * arrey[i-1];
        }
        System.out.println("counter: " + count);
        return a;
    }
    public static void main(String[] args) {
        int[] intput_test_arrey = {1, 2, 3, 4, 5};
        int[] output_test_arrey = new int[intput_test_arrey.length];

        output_test_arrey = new_arrey(intput_test_arrey);
        for (int i = 0; i < output_test_arrey.length; i++) {
            System.out.print(output_test_arrey[i] + " ");
        }

        System.out.println();
        System.out.println();
        output_test_arrey = new_arrey2(intput_test_arrey);
        for (int i = 0; i < output_test_arrey.length; i++) {
            System.out.print(output_test_arrey[i] + " ");
        }

    }
}
