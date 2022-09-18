import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        List<Integer> llist = new LinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        System.out.println(llist.toString());
        llist.remove(2);
        System.out.println(llist.toString());

    }
    
}
