import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramOrNot {

    public static boolean checkPangram(String str) {
        // Initialize a set of characters
        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            // If the character is already
            // a lowercase character
            if (ch >= 'a' && ch <= 'z')
                set.add(ch);

            // In case of a uppercase character
            if (ch >= 'A' && ch <= 'Z') {
                // convert to lowercase
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }

        // check if the size is 26 or not
        return set.size() == 26;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str = sc.nextLine();
        if (checkPangram(str))
            System.out.println("It is a Pangram");
        else
            System.out.println("It is Not a Pangram");
    }
}
