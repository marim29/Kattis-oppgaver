import java.util.Scanner;

class grassseed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double C = in.nextDouble();   // cost of seeds to sow one square meter
        int L = in.nextInt();   // number of lawns to sow

        double totCost = 0;

        for (int i = 0; i < L; i++) {
            double w = in.nextDouble();   // width of lawn
            double l = in.nextDouble();   // length of lawn

            double numLawns = w * l;
            double cost = C * numLawns;
            totCost += cost;
        }

        System.out.println(totCost);
    }
}
