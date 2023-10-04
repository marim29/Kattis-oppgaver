import java.util.Scanner;

class combinationlock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            int dial = in.nextInt();
            int first = in.nextInt();
            int second = in.nextInt();
            int third = in.nextInt();
            if ((dial + " " + first + " " + second + " " + third).equals("0 0 0 0")) {
              break;
            }

            int degrees = 0;

            // clockwise 2 full turns
            int twoTurns = 360 + 360;
            degrees += twoTurns;

            // stop at first number (30)
            int n1 = first - dial;
            degrees += n1 * 9;

            // turn counter-clockwise 1 full turn
            degrees += 360;

            // continue counter-clockwise to second number.
            int n2 = first - second;
            degrees += n2 * 9;

            int n3 = third - second;
            degrees += n3 * 9;

            System.out.println(degrees);
        }
    }
}
