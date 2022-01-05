import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
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
        if(flag==1) System.out.print("false");
        else
            System.out.print("true");

    }
}

