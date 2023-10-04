import java.util.Scanner;
import static java.lang.Math.*;

class estimatingtheareaofacircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            double r = in.nextDouble();
            double m = in.nextInt();
            double c = in.nextInt();

            if (r == 0 && m == 0 && c == 0) break;

            double a = Math.PI*r*r;
            double b = 4*(c/m)*r*r;

            System.out.println(a + " " + b);
        }
        in.close();
    }
}
