package psulistpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author purban1
 */
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Employee> empList = new ArrayList();
        
        empList.add(new Employee("Smith", "Mary", "555-55-5555"));
        empList.add(new Employee("Hunt", "John", "666-66-6666"));
        empList.add(new Employee("Bishop", "Jack", "222-22-2222"));
        
        for (Employee e : empList){
            System.out.println(e);
        }
    }
}
