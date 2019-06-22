public class Solution {
    public static int get_miss_posetive_in_line(int[] arr){
        int posetive_int = arr[0];
        if (arr[0]-1 > 0){
            posetive_int = arr[0]-1;
        }
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] + 1 > 0 ) {
                int temp_min = arr[i] + 1;
                if (arr[i + 1] != temp_min) {
                    //if (temp_min < posetive_int)
                    posetive_int = temp_min;
                }
            }
        }
        if (arr[arr.length - 1]+1 > 0 && arr[arr.length - 1] > 0){
            if (arr[arr.length - 1]+1 < posetive_int && arr[arr.length - 1] > 0)
                posetive_int = arr[arr.length - 1]+1;
        }


        return posetive_int;
    }
    public static void main(String[] args) {
        int[] check_me_1 = {3,4,-1,1};
        System.out.println("positive integer in line that was missed: " + get_miss_posetive_in_line(check_me_1));

        int[] check_me_2 = {1,2,0};
        System.out.println("positive integer in line that was missed: " + get_miss_posetive_in_line(check_me_2));
    }
}
