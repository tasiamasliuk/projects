import java.util.Scanner;

public class Solution {

    public static String pattern_time(int hh, int mm, int ss)
    {
        String time;

        if (hh < 10)
            time = "0" + hh + ":";
        else
            time = hh + ":";
        if (mm < 10)
            time = time + "0" + mm + ":";
        else
            time = time + mm + ":";
        if (ss < 10)
            time = time + "0" + ss;
        else
            time = time + ss;

        return time;
    }

    public static boolean intresting (int hh, int mm, int ss)
    {
        int temp = 0, c1 = hh/10,c2 = hh%10;
        do {
            if (c1 != c2)
                temp += 2;
            if (c1 != mm/10)
                temp ++;
            if (c2 != mm/10)
                temp ++;
            if (c1 != mm%10)
                temp ++;
            if (c2 != mm%10)
                temp ++;
            if (c1 != ss/10)
                temp++;
            if (c2 != ss/10)
                temp ++;
            if (c1 != ss%10)
                temp++;
            if (c2 != ss%10)
                temp ++;
        }while (temp < 2);
        if (temp > 2)
            return false;
        else
            return true;

    }

    public static int solution(String S, String T)
    {
        int count = 0;
        String time = S;
        //System.out.println(time);
        int hh = Integer.parseInt(time.substring(0,2));
        int mm = Integer.parseInt(time.substring(3,5));
        int ss = Integer.parseInt(time.substring(6,8));
        //System.out.println(hh + " " + mm + " " + ss);
        do {
            //System.out.println(time);

            if (intresting(hh,mm,ss))
            {
                count++;
                //System.out.println("INTERESTING "+ pattern_time(hh,mm,ss));
            }

            if (ss < 59)
            {
                ss++;
                time = pattern_time(hh,mm,ss);
            }
            else
            {
                if (mm < 59)
                {
                    ss = 0;
                    mm++;
                    time = pattern_time(hh,mm,ss);
                }
                else
                {
                    hh++;
                    mm = 0;
                    ss = 0;
                    time = pattern_time(hh,mm,ss);
                }
            }
        }while (!time.equals(T));

        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int hh, mm, ss;
        String time_point_one, time_point_two;

        System.out.println("Time 1: ");
        System.out.print("HH: ");
        hh = sc.nextInt();
        System.out.print("MM: ");
        mm = sc.nextInt();
        System.out.print("SS: ");
        ss = sc.nextInt();

        if (hh < 10)
            time_point_one = "0" + hh + ":";
        else
            time_point_one = hh + ":";
        if (mm < 10)
            time_point_one = time_point_one + "0" + mm + ":";
        else
            time_point_one = time_point_one + mm + ":";
        if (ss < 10)
            time_point_one = time_point_one + "0" + ss;
        else
            time_point_one = time_point_one + ss;

        System.out.println();
        System.out.println("Time 2: ");
        System.out.print("HH: ");
        hh = sc.nextInt();
        System.out.print("MM: ");
        mm = sc.nextInt();
        System.out.print("SS: ");
        ss = sc.nextInt();

        if (hh < 10)
            time_point_two = "0" + hh + ":";
        else
            time_point_two = hh + ":";
        if (mm < 10)
            time_point_two = time_point_two + "0" + mm + ":";
        else
            time_point_two = time_point_two + mm + ":";
        if (ss < 10)
            time_point_two = time_point_two + "0" + ss;
        else
            time_point_two = time_point_two + ss;

        System.out.println();
        System.out.println("Between " + time_point_one + " and " + time_point_two + " are " + solution(time_point_one, time_point_two) + " interesting points");

    }
}
