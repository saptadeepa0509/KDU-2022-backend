      import java.io.*;
      import java.util.*;
      public class Q2
      {
          public static void main(String[] args) throws Exception
          {
              Scanner sc = new Scanner(new File("/home/saptadeepa/KDU-2022-backend/country-list.csv"));
              sc.next();
              sc.useDelimiter(",|\\n");
              int count=0;
              while (sc.hasNext())
              {
                  System.out.print(sc.next()+ "  ");
                  count++;
                  if(count%3==0)
                      System.out.println();
                  if(count>=30)break;
              }
              System.out.println();
              sc.close();
              Scanner file = new Scanner(new File("/home/saptadeepa/KDU-2022-backend/country-list.csv"));
              TreeMap<String, String> tree_map = new TreeMap<String, String>(Collections.reverseOrder());
              file.next();
              file.useDelimiter(",|\\n");
              count=0;
              while (file.hasNext())
              {
                  StringBuilder country = new StringBuilder();
                  country.append(file.next());
                  StringBuilder capital = new StringBuilder();
                  capital.append(file.next());
                  file.next();
                  tree_map.put(capital.toString(),country.toString());
                  count++;
              }

              Set set = tree_map.entrySet();

              Iterator it = set.iterator();
              count=0;
              while(it.hasNext() && count<10) {
                  Map.Entry me = (Map.Entry)it.next();
                  System.out.print("Capital: "+me.getKey() + " & ");
                  System.out.println("Country: "+me.getValue());
                  count++;
              }


          }
      }