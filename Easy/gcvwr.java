import java.util.Scanner;

class gcvwr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int G = in.nextInt(), T = in.nextInt(), N = in.nextInt();
        int capacity = G - T; // GCVWR - truck weight = luggage weight
        int RealCapacity = (capacity * 90)/100;
        int sumItems = 0;

        for (int i = 0; i < N; i++) {
            int weight = in.nextInt();
            sumItems += weight;
        }

        int cap = RealCapacity-sumItems;
        System.out.println(cap);
    }
}
