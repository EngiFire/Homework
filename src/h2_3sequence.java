import java.util.Scanner;

public class h2_3sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        int x = 0, y = 0;
        while (n != 0) {
            if (n%3 == 0) {
                x++;
            }
            if (n < 0) {
                y++;
            }
            n = sc.nextInt();
        }
        if (x > y) {
            System.out.println("Result: 333");
        } else if (y > x) {
            System.out.println("Result: negative");
        } else {
            System.out.println("Result: Equal");
        }
    }
}
