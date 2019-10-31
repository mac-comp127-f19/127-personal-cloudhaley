package basicjava;
import java.lang.Math;
import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        double hyp = Math.sqrt(Math.pow(length1,2) + Math.pow(length2,2));
        return hyp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }
}
