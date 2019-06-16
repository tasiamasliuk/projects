import java.util.Arrays;

public class Solution {
    // a1 and a2 are the given arrays, and target is the target sum.
    // It should return an array of two numbers as the result,
    // one from each array


    //brute force solution O(n^2)
    public static int[] arrey_sum_target1(int arrey1[], int arrey2[], int target){
        int temp_i = 0, temp_j = 0;
        int sum = arrey1[temp_i] + arrey2[temp_j];
        int counter = 0;
        int success[] = {arrey1[temp_i], arrey2[temp_j]};

        for (int i = 0; i < arrey1.length; i++) {
            for (int j = 0; j < arrey2.length; j++) {
                if (( sum < arrey1[i] + arrey2[j]) && (arrey1[i] + arrey2[j] <= target) || (target <= arrey1[i] + arrey2[j]) && (arrey1[i] + arrey2[j] < sum)){
                    temp_i = i;
                    temp_j = j;
                    sum = arrey1[temp_i] + arrey2[temp_j];
                    success[0] = arrey1[temp_i];
                    success[1] = arrey2[temp_j];
                }
                counter++;
            }
        }
        System.out.println("counter: " + counter);
        return success;
    }

    // O(x*n)
    public static int[] arrey_sum_target2(int arrey1[], int arrey2[], int target){
        int counter = 0;
        int success[] = new int[2];

        int temp = 0;
        for(;;){
            for (int i = 0; i < arrey1.length; i++) {
                for (int j = 0; j < arrey2.length; j++) {
                    if (((target - temp) - arrey1[i]) == arrey2[j]) {
                        success[0] = arrey1[i];
                        success[1] = arrey2[j];
                        System.out.println("counter: " + counter);
                        return success;
                    }
                    counter++;
                }
            }
            temp++;
        }
    }

    //Time O(n*log(n)) Space O(n)
    public static int[] arrey_sum_target3(int arrey1[], int arrey2[], int target){
        int counter = 0;
        int[] a1Sorted = Arrays.copyOf(arrey1, arrey1.length);
        Arrays.sort(a1Sorted);
        int[] a2Sorted = Arrays.copyOf(arrey2, arrey2.length);
        Arrays.sort(a2Sorted);

        int success[] = new int[2];
        success[0] = a1Sorted[0];
        success[1] = a2Sorted[0];


        int i = 0, j = arrey1.length-1;
        do{
            counter++;
            if ((a1Sorted[i] + a2Sorted[j]) == target){
                success[0] = a1Sorted[i];
                success[1] = a2Sorted[j];
                return success;
            }
            if ((a1Sorted[i] + a2Sorted[j]) < target){
                if (success[0]+success[1] < a1Sorted[i] + a2Sorted[j]){
                    success[0] = a1Sorted[i];
                    success[1] = a2Sorted[j];
                }
                i++;
            }
            else {
                if (success[0] + success[1] > a1Sorted[i] + a2Sorted[j]) {
                    success[0] = a1Sorted[i];
                    success[1] = a2Sorted[j];
                }
                j--;
            }
        }while(j > 0);
        System.out.println("counter: " + counter);
        return success;
    }



    public static void main(String[] args) {
        int target = 24;
        int[] a = {-1,3,8,2,9,5};
        int[] b = {4,1,2,10,5,20};
        int[] solw = new int[2];

        solw = arrey_sum_target1(a,b,target);
        System.out.println(solw[0] + " " + solw[1]);

        solw = arrey_sum_target2(a,b,target);
        System.out.println(solw[0] + " " + solw[1]);

        target = 13;
        int[] a_mini = {1,4,7,10};
        int[] b_mini = {7,5,8,4};

        solw = arrey_sum_target1(a_mini,b_mini,target);
        System.out.println(solw[0] + " " + solw[1]);

        solw = arrey_sum_target2(a_mini,b_mini,target);
        System.out.println(solw[0] + " " + solw[1]);

        solw = arrey_sum_target3(a_mini,b_mini,target);
        System.out.println(solw[0] + " " + solw[1]);

    }
}
