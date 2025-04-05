import java.util.Scanner;

public class LengthConverter {

    public static double mmToCm(double mm) {
        return mm / 10.0;
    }
    public static double cmToM(double cm) {
        return cm / 100.0;
    }
    public static double mToKm(double m) {
        return m / 1000.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in millimeters (mm): ");
        double mm = scanner.nextDouble();
        double cm = mmToCm(mm);
        System.out.println(mm + " mm = " + cm + " cm");
        System.out.print("\nEnter length in centimeters (cm): ");
        double cmInput = scanner.nextDouble();
        double m = cmToM(cmInput);
        System.out.println(cmInput + " cm = " + m + " m");
        System.out.print("\nEnter length in meters (m): ");
        double mInput = scanner.nextDouble();
        double km = mToKm(mInput);
        System.out.println(mInput + " m = " + km + " km");

        scanner.close();
    }
}
