import java.util.*;

public class DequeTest {
    public static void main(String[] args) throws Throwable {
        Deque<Integer> que = new ArrayDeque<>();
        que.addFirst(12);
        que.addFirst(23);
        que.addLast(14);
        que.addFirst(1);
        System.out.println(que);
        System.out.println(que.peek());
        /*
         * java.util.Deque is only an interface and therefore cannot be instantiated directly. 
         * All your variables (including the array) can still be of the 
         * type Deque and Deque[] respectively, 
         * since java.util.LinkedList implements that interface.
         */
    }
}