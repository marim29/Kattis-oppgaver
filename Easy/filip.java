import java.util.Scanner;
import java.lang.Integer.*;


class filip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        String stringA = Integer.toString(A);
        String stringB = Integer.toString(B);

        String newA = "";
        String newB = "";

        for (int i = 2; i >= 0; i--) {
            newA += stringA.charAt(i);
            newB += stringB.charAt(i);
        }

        int Afinal = Integer.parseInt(newA);
        int Bfinal = Integer.parseInt(newB);

        if (Afinal > Bfinal) {
            System.out.println(Afinal);
        } else {
            System.out.println(Bfinal);
        }
    }
}
