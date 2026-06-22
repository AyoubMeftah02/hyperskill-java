import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int nBridges = scanner.nextInt();
        
        String status = null;
        for (int i = 1; i <= nBridges; i++) {
            int bridgeHeight = scanner.nextInt();

            if (busHeight < bridgeHeight) {
                status = "Will not crash";
            } else {
                status = "Will crash on bridge " + i;
                break;
            }
        }
        System.out.print(status);

        
    }
}
