import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println("--- StreamAPI ---");
        System.out.println("Count occurrence of a given character in a string using Stream API in Java\n\n");
        List<Character> list = Arrays.asList('a','a','b','c','f','c','a');
        char charToFind = 'c';
        long count = list.stream().filter(n->n==charToFind).count();
        System.out.println("occurrence of "+charToFind+" : "+count);
    }
}
