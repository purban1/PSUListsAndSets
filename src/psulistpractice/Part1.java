package psulistpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author purban1
 */
public class Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List myHobbies = new ArrayList();
        
        myHobbies.add("Bowling");
        myHobbies.add("Movie Watching");
        myHobbies.add("Video Games");
        myHobbies.add("Pumpkin Chunkin");
        
        System.out.println("My Hobbies:");
        for (int i = 0; i < myHobbies.size(); i++){
            System.out.println((String)myHobbies.get(i));
        }
    }
}
