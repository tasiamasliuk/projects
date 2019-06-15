public class Solution {
    static int[] new_arr;
  
    static void add_one(int arr[]){
        int carry = 1, sum = 0;
        new_arr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            sum = arr[i]+carry;
            if (sum == 10)
                carry = 1;
            else
                carry = 0;
            new_arr[i] = sum%10;
        }
        if (carry == 1) {
            new_arr = new int[arr.length+1];
            new_arr[0] = 1;
        }
    }
    public static void main(String[] args) {
        int[] cheсk1 = {9,0,4,9};
        add_one(cheсk1);

        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
        System.out.println();

        int[] cheсk2 = {9,9,9,9,9,9};
        add_one(cheсk2);

        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
        System.out.println();

        int[] cheсk3 = {0};
        add_one(cheсk3);

        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}
