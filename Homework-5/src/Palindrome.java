public class Palindrome {
    boolean check(String str)
    {
        int i = 0, j = str.length() - 1;
        int flag =0;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
            {
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==1) return false;
        else
           return  true;
    }

}
