import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String type = scanner.next();
        double area = 0.0;
        
        switch (type) {
            case "triangle":
            	double a = scanner.nextDouble();
        		double b = scanner.nextDouble();
        		double c = scanner.nextDouble();
                double s = (a + b + c) / 2.0;
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            case "rectangle":
            	double x = scanner.nextDouble();
        		double y = scanner.nextDouble();
                System.out.println(x * y);
                break;
            case "circle":
            	double r = scanner.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
            default:
                System.out.println("Invalid shape");
        }
    }
}
