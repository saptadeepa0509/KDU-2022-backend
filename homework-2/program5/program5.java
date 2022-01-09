import java.util.*;
import java.io.*;

class Program5 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            Scanner sc = new Scanner(file);
            System.out.println(file);

        } catch (FileNotFoundException e) {
            System.out.println( e);

        }

        try {
            int s = Integer.parseInt("abcd");
            System.out.println(s);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        try {
            double p=20/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        try{
           int[] intArray = new int[20];
            System.out.println(intArray[75]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            int a=5,b=0,c;
            try{
                int  x=a/b;
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            finally {
                System.out.println("inner finally block executed");
            }
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
