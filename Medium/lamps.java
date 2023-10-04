import java.util.Scanner;

class lamps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(); // hours per day the lamp is on
        int P = in.nextInt(); // price of electricity

        System.out.println(h);
        System.out.println(P);

        float incandescentBulb = 60 * h * P;


        float lowEnergyLamp = 11 * h * P;

        // float perDayIB = incandescentBulb/100000;
        float perDayLEL = lowEnergyLamp/100000;

        System.out.println(perDayLEL);
        // output: number of days after which the low energy lamp is cheaper than the incandescent bulb.



    }
}
