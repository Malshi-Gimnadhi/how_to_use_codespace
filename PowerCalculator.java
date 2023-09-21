import java.util.Scanner;

public class PowerCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the base number: ");
    double base = scanner.nextDouble();

    System.out.println("Enter the exp: ");
    double exp = scanner.nextDouble();

    double power = calculatePower(base, exp);
    System.out.println("The power of " + base + " raised to" + exp + " is " +power );
  }

  private static double calculatePower(double base, double exp) {
    double result = 1;
    for (int i = 0; i < exp; i++) {
      result *= base;
    }
    return result;
  }
}
