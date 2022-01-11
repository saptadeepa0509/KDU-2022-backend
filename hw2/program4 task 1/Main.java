import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();

        System.out.println("Enter another string");
        String s2 = sc.nextLine();

        System.out.println(s1.lastIndexOf(s2));
    }
}