//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

import java.util.Arrays;

public class Solution {

    public static boolean add_two_to_k(int list[], int k){
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                counter++;
                if (list[i] + list[j] == k) {
                    System.out.println("counter: " + counter);
                    return true;
                }
            }
        }
        System.out.println("counter: " + counter);
        return false;
    }

    public static boolean add_two_to_k2(int list[], int k){
        int counter = 0;
        Arrays.sort(list);
        int j = list.length - 1, i = 0;
        while (i < list.length) {
            do{
                counter++;
                if (list[i] + list[j] == k) {
                    System.out.println("counter: " + counter);
                    return true;
                }
                if (list[i] + list[j] > k){
                    j--;
                }
                else
                    i++;
            }while(j >= 0);
        }
        System.out.println("counter: " + counter);
        return false;
    }

    public static void main(String[] args) {
        int[] array_for_test = {4,3,8,10};
        System.out.println(add_two_to_k(array_for_test, 13));

        System.out.println(add_two_to_k2(array_for_test, 13));
    }
}
