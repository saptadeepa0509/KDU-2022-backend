import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class Example {
    public static void maxExample() {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        System.out.print("The maximum Price is : ");
       float var =productList.stream().map(Product::getPrice).max(Float::compare).get();
        System.out.println(var);
    }
    public static void minExample() {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        System.out.print("The minimum value is : ");
        Float var = productList.stream().map(Product::getPrice).min(Float::compare).get();
        System.out.println(var);
    }
    public static void anymatchExample(){
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
                boolean ans=productList.stream().map(Product::getName).anyMatch(s -> Character.isUpperCase(s.charAt(1)));
        System.out.println(ans);
   }
    public static void allmatchExample(){
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        boolean ans=productList.stream().map(Product::getName).allMatch(s -> Character.isLowerCase(s.charAt(2)));
        System.out.println(ans);
    }
    public static void filterExample(){
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        long ans=productList.stream().map(Product::getName).filter(s -> s.length()<6).count();
        System.out.println(ans);
    }
    public static void sortExample() {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        System.out.println("The sorted stream is : ");
        productList.stream().map(list->list.getPrice()).sorted().forEach(System.out::println);
    }
    public static void groupbyExample() {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "potatoes"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        System.out.println(productList.stream().collect(Collectors.groupingBy(list->list.getName(),Collectors.counting())));


    }
      public static void average(){
          List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                  new Product(14, "potatoes"), new Product(13, "lemon"),
                  new Product(23, "bread"), new Product(13, "sugar"));
                 double averagePrice = productList.stream()
                  .collect(java.util.stream.Collectors.averagingDouble(Product::getPrice));

          System.out.println("Average price: " + averagePrice);
      }
    public static void sum(){
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        System.out.println("sum after increment");
        System.out.println(productList.stream().map(list->list.getPrice()*1.25).reduce(0.0, (a, b) -> (a+b)));


    }

    public static void main(String[] args) {
        maxExample();
        minExample();
        anymatchExample();
        allmatchExample();
        filterExample();
         sortExample();
        groupbyExample();
        average();
        sum();
    }
}
 class Product {
    private float price;
    private String name;

    public Product(float price, String name) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

     public void setPrice(float price) {
         this.price = price;
     }

     public void setName(String name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "price=" + price +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
