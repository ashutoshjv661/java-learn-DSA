import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        //Normal Arrays
        // int[] list = new int[Size];
        
        //ArrayList is Dynamic in size.
        //ArrayList, Collections are present in java.util package
        //DEFAULT_CAPACITY = 10;

        //List is an interface extending collections and ArrayList implements List

        List<String> list = new ArrayList<String>();
        list.add("Hi");
        //Adds at the end of the list like push_back
        list.add(1,"How are you");
        //Add all is a overloaded method. To add at an index.
        System.out.println(list);

        //To add new existing list to create a new list
        List<String> newList = new ArrayList<>();
        newList.addAll(list);
        System.out.println(newList);

        //getting value 
        System.out.println(list.get(1));

        //Set value, replaces old value at that index
        System.out.println(list.set(0, "New"));

        //Removing value
        
        List<Integer> list2 = new Arrays.

    }
}
