import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            int a=i;
            while(a>0)
            {
                int digit = a % 10;
                sum = sum + digit;
                a = a / 10;
            }
            if(sum%3==0){
                System.out.print(i +" ");

            }
            sum=0;
        }

    }
}

