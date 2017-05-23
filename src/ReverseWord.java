import java.io.IOException;
import java.util.*;
/**
 * Created by eeliz_000 on 5/22/2017.
 */
public class ReverseWord {
    public static void main(String[] args) throws IOException {
        String input, output;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a string");
            input = scan.nextLine();
            if(input.equals(""))
                break;
            Reverseer rev = new Reverseer(input);
            output = rev.doRev();
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }

    }
}
