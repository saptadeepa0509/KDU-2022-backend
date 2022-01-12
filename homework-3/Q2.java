import java.io.*;
import java.util.*;
public class Q2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("/home/saptadeepa/KDU-2022-backend/country-list.csv"));
        sc.next();
        sc.useDelimiter(",|\\n");
        int c=0;
        while (sc.hasNext())
        {
            System.out.print(sc.next());
            c++;
            if(c>=30)break;
        }
        sc.close();
        Scanner file = new Scanner(new File("/home/saptadeepa/KDU-2022-backend/country-list.csv"));
        TreeMap<String, String> tree_map = new TreeMap<String, String>();
        file.next();
        file.useDelimiter(",|\\n");
        while (file.hasNext())
        {
            String country=file.next();
            String capital=file.next();
            file.next();
           //tree_map.put(country,capital);
            System.out.println(country +" "+capital);
        }
       //tree_map= tree_map.descendingMap();
        System.out.println("TreeMap after reverse:" + tree_map);

    }
}