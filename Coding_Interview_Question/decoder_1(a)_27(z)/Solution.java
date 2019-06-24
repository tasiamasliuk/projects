public class Solution {
    public static int decoder(String data){
        if (data.length() == 0)
            return 0;

        if (Integer.parseInt(data) == 0)
            return 0;

        if (0 < Integer.parseInt(data) && Integer.parseInt(data) <= 9 && data.length() == 1)
            return 1;

        if (9 < Integer.parseInt(data.substring(0,2)) && Integer.parseInt(data.substring(0,2)) < 27){
            if (data.length() == 2)
                return 1 + decoder(data.substring(1));
            return decoder(data.substring(1)) + decoder(data.substring(2));
        }

        else
            if (0 < Integer.parseInt(data.substring(0,1)))
                return decoder(data.substring(1));
        return 0;
    }

    public static void main(String[] args) {
        String try_me_1 = "111";
        System.out.println("There are " + decoder(try_me_1) + " ways to decode " + try_me_1);

        String try_me_2 = "001";
        System.out.println("There are " + decoder(try_me_2) + " ways to decode " + try_me_2);

        String try_me_3 = "2012";
        System.out.println("There are " + decoder(try_me_3) + " ways to decode " + try_me_3);

        String try_me_4 = "12345";
        System.out.println("There are " + decoder(try_me_3) + " ways to decode " + try_me_4);
    }
}
