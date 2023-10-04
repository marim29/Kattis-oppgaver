import java.util.Scanner;

class Spavanac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();

        if (M >= 45) {
            H = H;
            M = M-45;
            System.out.println(H + " " + M);
        }
        else if ((H == 0) && (M < 45)) {
                H = 23;
                M = 60 + M - 45;
                System.out.println(H + " " + M);
        }
        else {
            H = H-1;
            M = 60 + M - 45;
            System.out.println(H + " " + M);
        }
    }
}
