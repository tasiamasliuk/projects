public class Solution {
    public static int climb_up (int l){
        if (l <= 0)
            return 0;
        if (l == 1)
            return 1;
        if (l == 2)
            return (1 + climb_up(l - 1));
        else
            return climb_up(l - 2) + climb_up(l - 1);
    }

    public static void main(String[] args) {
        System.out.println("If N is 4, then there are " + climb_up(4) + " unique ways you can climb the staircase");
        System.out.println("If N is 2, then there are " + climb_up(2) + " unique ways you can climb the staircase");
        System.out.println("If N is 6, then there are " + climb_up(6) + " unique ways you can climb the staircase");
    }
}
