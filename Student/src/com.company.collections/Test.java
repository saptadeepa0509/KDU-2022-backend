import com.company.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("cconfig.xml");
        Employee employee= (Employee) applicationContext.getBean("Employee1");
        System.out.println(employee.getName());
        System.out.println(employee.getAddresses());
        System.out.println(employee.getPhone_no());
        System.out.println(employee.getCertifications());
        System.out.println(employee.getProp());
    }
}
