import java.util.List;
import java.util.Arrays;
class wildCard{
    public static void printList(List<?>List){
        for (Object elem : List)
            System.out.print(elem + " ");
        System.out.println();
    }
}

public class week10_1{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        wildCard.printList(li);
        wildCard.printList(ls);
    }
}