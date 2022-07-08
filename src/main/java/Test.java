import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Well hello there, can you give me a string of words?");
        String umNum = scanner.nextLine();
        if (StringUtils.isNumeric(umNum)) {
            System.out.println("We were looking for a string but got something else instead!");
            System.exit(0);
        } else {
            System.out.println("\"" + umNum + "\" is not a number! yay!");
        }

        System.out.println("Let see the string case be flipped");
        System.out.println(StringUtils.swapCase(umNum));

        System.out.println("Now lets see that string in reverse!");
        System.out.println(StringUtils.reverse(umNum));


    }
}
