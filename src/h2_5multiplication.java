import java.util.Scanner;

public class h2_5multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            int res = n * i;
            System.out.println(n + "*" + i + " = " + res);
        }
    }
}
