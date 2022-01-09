import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        findDuplicate(str);

    }

    public static void findDuplicate(String str){
        if(str.isEmpty()){
            System.out.println("string is empty");
        }
        if(str.length()==1){
            System.out.println("single Character string");
        }
        char input_string[]=str.toCharArray();
        Map<Character,Integer>charMap=new HashMap<Character,Integer>();
        for(Character ch:input_string){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }
            else{
                charMap.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>>entrySet=charMap.entrySet();
        for(Map.Entry<Character,Integer>entry:entrySet){
            if(entry.getValue()>1 && entry.getKey()!=' ')
                System.out.println(entry.getKey()+":" +entry.getValue());
        }
    }

}