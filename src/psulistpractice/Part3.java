package psulistpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author purban1
 */
public class Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List manAndDog = new ArrayList();
        
        manAndDog.add(new Employee("Smith", "Mary", "555-55-5555"));
        manAndDog.add(new Employee("Hunt", "John", "666-66-6666"));
        manAndDog.add(new Dog("Thunder", 2468));
        manAndDog.add(new Dog("CatCrunch", 1357));
        
        for (int i = 0; i < manAndDog.size(); i++){
            Object obj = manAndDog.get(i);
            if(obj instanceof Dog) {
                System.out.println("Rabies ID: " + ((Dog)obj).getRabiesId());
            
            } else if(obj instanceof Employee) {
                System.out.println("SSN: " + ((Employee)obj).getSsn());
            }
        }
    }
}
