import java.util.Scanner;

public class h1_task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 'n': ");
        int n = sc.nextInt();
        System.out.print("Enter the number 'x': ");
        int x = sc.nextInt();
        int i = x;
        while (i < n) {
            i += x;
        }
        System.out.println("Result: " + i);
    }
}