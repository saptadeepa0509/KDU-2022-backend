import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int a = 1;
        int sum = 0;
        int x = 0;
        int i = 1;
        System.out.print(a+" ");
        while(i<n)
        {
            x++;
            if(x%3==0)continue;

            i = i+x*4;
            if(i>n)break;
            System.out.print(i+" ");

        }
    }
}