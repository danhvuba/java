import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // input
        System.out.print("enter 2 numbers: ");
        int x;
        int y;
        try (Scanner input = new Scanner(System.in)) {
            x = input.nextInt();
            y = input.nextInt();
        }
        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        // array
        char[] arr = { 'a', 'b', 'd' };
        for (char c : arr) {
            System.out.println(c);
        }

    }
}
