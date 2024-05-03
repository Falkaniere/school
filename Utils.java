import java.util.Scanner;

public class Utils {

    public static int inputInt() {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        return value;
    }

    public static String inputString() {
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        return value;
    }

}
