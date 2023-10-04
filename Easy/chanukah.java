import java.util.Scanner;

class chanukah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();

        for (int i = 0; i < P; i++) {
            int SetNumber = in.nextInt();
            int days = in.nextInt();
            int candles = 0;
            int extraCandle = 1;
            for (int j = 0; j < days; j++) {
                int lit = j+1;
                candles += lit;
                candles += extraCandle;
            }
            System.out.println(SetNumber + " " + candles);
        }
    }
}
