import java.util.Scanner;
import java.lang.Math.*;

class pyramids {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double restBlocks = in.nextInt();
        int number = 1;
        int layers = 0;

        while(restBlocks > 0) {
            restBlocks = restBlocks - Math.pow(number, 2);
            if (restBlocks < 0) {
              break;
            }
            layers++;
            number = number+2;
        }
        System.out.println(layers);
    }
}
