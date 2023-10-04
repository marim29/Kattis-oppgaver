import java.util.Scanner;

class faktor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); // number of articles you plan to publish
        int I = in.nextInt(); // impact factor the owners require

        double Ismallest = I - 0.99;
        double B = A * Ismallest;

        int C = (int)Math.ceil(B);

        System.out.println(C);

    }
}
