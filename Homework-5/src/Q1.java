
public  class Q1
{
    public void Display()
    {
        System.out.println("Base display()");
    }
    static  class DeprecatedTest
    {
        @Deprecated
        public void Display()
        {
            System.out.println("Deprecatedtest display()");
        }
    }
    public static void main(String args[])
    {
        Q1 t1 = new Derived();
        t1.Display();
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}


class Derived extends Q1
{
    @Override
    public void Display()
    {
        System.out.println("Derived display()");
    }
}
