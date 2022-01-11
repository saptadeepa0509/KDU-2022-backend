import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);
    }

}
