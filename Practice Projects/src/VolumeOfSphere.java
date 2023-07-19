import java.util.Scanner;

public class VolumeOfSphere {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diameter:");
        double d = sc.nextDouble();

        double volume = volumeOfSphere(d);
        System.out.println("volume is " + volume);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter mass:");
        double m = sc2.nextDouble();

        double density = m / volume;

        System.out.println(density);

    }

    public static double volumeOfSphere(double diameter) {

        return (4 * (Math.PI) * (Math.pow(diameter/2/10, 3))) / 3;
    }
}
