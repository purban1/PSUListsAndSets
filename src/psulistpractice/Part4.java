package psulistpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author purban1
 */
public class Part4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Remember, a Set is a sub-interface of Collection, and has no
        // get method. so you can't retrieve individual objets. It's design 
        // to transform data (remove duplicates) only.
        Set<Employee> empSet = new HashSet<Employee>();
        
        empSet.add(new Employee("Smith", "Mary", "222-22-2222"));
        empSet.add(new Employee("Hunt", "John", "666-66-6666"));
        empSet.add(new Employee("Bishop", "Jack", "222-22-2222"));
        
        // Pass the set to a list for use in a Enhanced For loop (For-Each Loop) 
        List<Employee> empList = new ArrayList<Employee>(empSet);
        for (Employee e : empList){
            System.out.println(e);
        }
    }
}
