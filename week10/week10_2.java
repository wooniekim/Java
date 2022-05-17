import java.util.*;
public class week10_2 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        String[] sample = {"단어", "중복", "구절", "중복"};
        for (String a : sample)
            if(!s.add(a))
                System.out.println("중복된 단어" + a);
        System.out.println(s.size() + "중복되지 않은 단어: " + s);
    }
}