import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();

        System.out.println("Enter another string");
        String s2 = sc.nextLine();

        System.out.println("Enter position");
        int insertionindex = sc.nextInt();

        String a = s1.substring(0,insertionindex+1);
        String b = s1.substring(insertionindex+1);

        a = a.concat(s2);
        a = a.concat(b);

        System.out.println(a);
    }
}