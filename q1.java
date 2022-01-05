import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int a = 1;
        int b = 4;
        int c = 7;
        int sum = 0;
        System.out.print(a+" "+b+" "+c+" ");
        while(sum<n)
        {

            sum = a+b+c;
            if(sum>n)break;
            System.out.print(sum+" ");
            a = b;
            b = c;
            c = sum;

        }
    }
}