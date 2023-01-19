package StreamAPI;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/**
 Stream API was introduced in Java 1.8 
 */
public class Main {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        List<Integer> nums = Arrays.asList(4,5,1,2,4,6,12);
        System.out.println(nums);

        //Lets say we want to print Individual values 
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        // We can also use Enhanced for loop
        /*
            for(int i:nums) {System.out.println(i)}
         */

        // We can also print using ForEach Loop 
        nums.forEach(val -> System.out.println(val)); //Lambda Expression , Anonymous function
        //For each takes Consumer , using consumer interface
        //nums.stream();
        // 1 . Filter 
    }
}
