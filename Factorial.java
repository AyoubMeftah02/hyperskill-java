import java.util.Scanner;

public class Main {
    static int fact(int n) {
         if (n == 0) {
             return 1;
        } else {
             return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        System.out.print(fact(n));

        scanner.close();
    }
}
