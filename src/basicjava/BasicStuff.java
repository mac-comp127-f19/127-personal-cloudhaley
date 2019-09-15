package basicjava;

import java.lang.Math;

public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 18;
        double age1 = 19;
        System.out.println("We are "+ age0 + " and " + age1);

        double sumofages = age0 + age1;
        System.out.println("The sum of the ages is " + sumofages);
        System.out.println("The sum of ages is " + (age0 + age1));

        System.out.println(6/4);
        System.out.println(6/3);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

        int days = 1600/24;
        int weeks = 1600/168;
        int hours = 1600/1;

        System.out.println(days + " is the number of days in 1600 hours");
        System.out.println(weeks + " is the number of weeks in 1600 hours");
        System.out.println(hours + " is the number of hours in 1600 hours");

        double r = 59;
        double h = 28;
        double V = (1.0/3.0)*3.1415*(r*r)*h;
        double A = 3.1415 * (r*r) + 3.1415*r*(Math.sqrt((Math.pow(r,2)) + (Math.pow(h,2))));

        System.out.println(V + " is the volume.");
        System.out.println(A + " is the surface area.");

    }
}
