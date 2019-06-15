public class Solution {
    static int solution(String S)
    {
        char[] ch = S.toCharArray();
        int min = S.length();

        for (int mark_index = 0; mark_index < ch.length; mark_index++)
        {
            char mark = ch[mark_index], p_mark = 0;
            int i = 0, temp = 0;
            while ((temp <= min) && (i < ch.length))
            {
                if (mark_index > i)
                {
                    if (ch[i] <= mark)
                    {
                        if (p_mark == 0) 
                          p_mark = ch[i];
                        else
                            if (p_mark > ch[i]) 
                              temp++;
                            else 
                              p_mark = ch[i];
                    }
                    else temp++;
                }

                if (mark_index < i)
                {
                    if(mark <= ch[i]) 
                      mark = ch[i];
                    else 
                      temp++;
                }
                i++;
            }
            if (temp < min) 
              min = temp;
        }
        return min;
    }

    public static void main(String[] args) {
        String str = "again";
        int k = solution(str);
        System.out.println(k);

    }
}
