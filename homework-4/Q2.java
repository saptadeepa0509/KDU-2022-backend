import java.util.*;

public  class Q2 {
    public static void main(String[] args) {
        List<Employee> employees=new LinkedList<>();
        //List<Employee> employees=new ArrayList<>();
        for (int i=0;i<10000;i++)
        {
            employees.add(new Employee(i,100));
        }

        //for-example
        long start = System.currentTimeMillis();
        long start1 = System.nanoTime();
        for(int i=0;i<10000;i++)
        {
            int  x=employees.get(i).getId();
        }
        long finish = System.currentTimeMillis();
        long finish1 = System.nanoTime();
        long timeElapsed = finish - start;
        long timeElapsed1 = finish1 - start1;
        System.out.println(" time taken to run for-loop" +" " + timeElapsed);
        System.out.println(" time taken to run for-loop" +" " + timeElapsed1);

        //for-each loop
        start = System.currentTimeMillis();
        start1 = System.nanoTime();
        for( Employee employee: employees)
        {
            int  x=employee.getId();
        }
        finish = System.currentTimeMillis();
        finish1 = System.nanoTime();
        timeElapsed = finish - start;
        timeElapsed1 = finish1 - start1;
        System.out.println(" time taken to run for-each loop" +" " + timeElapsed);
        System.out.println(" time taken to run for-each loop" +" " + timeElapsed1);

        //stream.foreach loop
        start = System.currentTimeMillis();
        start1 = System.nanoTime();
        employees.stream().forEach(employee -> {
            int x= employee.getId();
        });
        finish = System.currentTimeMillis();
        finish1 = System.nanoTime();
        timeElapsed = finish - start;
        timeElapsed1 = finish1 - start1;
        System.out.println(" time taken to run stream().foreach loop" +" " + timeElapsed);
        System.out.println(" time taken to run stream().foreach loop" +" " + timeElapsed1);

        //parallelStream.foreach loop
        start = System.currentTimeMillis();
        start1 = System.nanoTime();
        employees.parallelStream().forEach(employee -> {
            int x= employee.getId();
        });
        finish = System.currentTimeMillis();
        finish1 = System.nanoTime();
        timeElapsed = finish - start;
        timeElapsed1 = finish1 - start1;
        System.out.println(" time taken to run parallelStream().foreach loop" +" " + timeElapsed);
        System.out.println(" time taken to run parallelStream().foreach loop" +" " + timeElapsed1);
    }
}


class Employee{
    private int id;
    private double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

}