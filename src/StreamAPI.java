import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("-----------------------------------------");
            System.out.println("\n\n--- StreamAPI ---");
            System.out.println("\n1. Count occurrence of a given character in a string");

            System.out.println("99. Exit");
            System.out.println("\nEnter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    List<Character> list = Arrays.asList('a','a','b','c','f','c','a');
                    char charToFind = sc.next().charAt(0);
                    long count0 = list.stream().filter(n->n==charToFind).count();
                    System.out.println("occurrence of "+charToFind+" : "+count0);
                    break;
                case 1:
                    System.out.print("Enter the input string : ");
                    sc.nextLine();
                    String str = sc.nextLine();
                    System.out.print("Enter the character to find : ");
                    char charFind = sc.next().charAt(0);
                    long count1 = str.chars().filter(n->n==charFind).count();
                    System.out.println("occurrence of '"+charFind+"' : "+count1);
                    break;
                case 99: System.exit(1);
                default:
                    System.out.println("WRONG INPUT! again choose from 0 to 1!");
            }
        }
    }
}
