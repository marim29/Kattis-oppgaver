import java.util.Scanner;

class metronome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double out = (double)n/4;

        System.out.println(out);
    }
}
