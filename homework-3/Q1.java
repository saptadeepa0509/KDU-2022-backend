import java.io.*;
import java.lang.*;
import java.util.*;

public class  Q1{
    public static void main(String[] args) {

        List<Employees> employees = new ArrayList<Employees>();

        employees.add(new Employees(200.0,300.0,"Umesh Awasthi"));
        employees.add(new Employees(300,400,"Robert Hickle"));
        employees.add(new Employees(100,400,"John Smith"));
        Collections.sort(employees);
        for(Employees it: employees)
        {
            System.out.println(it.getSalary() +" "+ it.getEquityShares()+" "+ it.getEname());
        }

    }
}

class Employees  implements Comparable<Employees>{
    private double salary;
    private double equityShares;
    private String ename;

    public Employees(double salary, double equityShares, String ename) {
        this.salary = salary;
        this.equityShares = equityShares;
        this.ename = ename;
    }

    public Employees() {
        salary = 0.0;
        equityShares = 0.0;
        ename = "";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getEquityShares() {
        return equityShares;
    }

    public void setEquityShares(double equityShares) {
        this.equityShares = equityShares;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Employees)) return false;
        if (!super.equals(object)) return false;
        Employees employees = (Employees) object;
        return java.lang.Double.compare(employees.salary, salary) == 0 && java.lang.Double.compare(employees.equityShares, equityShares) == 0 && java.util.Objects.equals(ename, employees.ename);
    }
    public int compareTo(Employees employee) {
        return this.salary> employee.salary ? 1 : this.salary < employee.salary ? -1 : 0;
    }

}
//class SortbySalary implements Comparable<Employees> {
//
//    public int compare(Employees a, Employees b){
////        if(a.getSalary() -b.getSalary()>0){
////            return 1;
////        }
////        else if(a.getSalary() -b.getSalary()==0){
////            return  0;
////        }
////        else
//            return -1;
//        return  (int) a.getSalary()-(int)b.getSalary();
//    }
//}

