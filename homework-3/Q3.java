import java.io.*;
import java.lang.*;
import java.util.*;

public  class Q3{
    public static void main (String[] args)
    {
        hello<String> sObj = new hello<String>("Generic class");
        System.out.println(sObj.getObject());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Data data = new Data();
        System.out.println("Printing integer list");
        data.printListData(list);
    }}
class Data {
    public <E> void printListData(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }
}
class hello<T>
{
    T obj;
    hello(T obj) {  this.obj = obj;  }
    public T getObject(){
        return this.obj;
    }
}

