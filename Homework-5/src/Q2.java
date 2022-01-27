import java.lang.annotation.*;

public  class Q2 {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Smartphone{
        String OS() default "windows";
        int version() default 1;
    }
    @Smartphone(OS = "Android",version = 6)
    static class samsungGalaxySeries{
        String modelName;
        int screenSize;

        public samsungGalaxySeries(String modelName, int screenSize) {
            this.modelName = modelName;
            this.screenSize = screenSize;
        }
    }

    public static void main(String[] args) {
       samsungGalaxySeries phone=new samsungGalaxySeries("s1",6);
        Class C =phone.getClass();
        Annotation annotation = C.getAnnotation(Smartphone.class);
        Smartphone s2=(Smartphone) annotation;
        System.out.println(s2.OS());

    }
}