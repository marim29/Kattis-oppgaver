import java.util.Scanner;

class bela {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] dom = {11, 4, 3, 20, 10, 14};
        int[] non = {11, 4, 3, 2, 10, 0};

        int sum = 0;

        int N = in.nextInt();
        String B = in.next();

        for (int i = 0; i < 4*N; i++) {
            String card = in.next();
            String val = card.substring(0, 1);
            String suit = card.substring(1);

            if (val.equals("A"))
                sum += non[0];

            else if (val.equals("K"))
                sum += non[1];

            else if (val.equals("Q"))
                sum += non[2];

            if (val.equals("J") && suit.equals(B))
                sum += dom[4];
            else if (val.equals("J"))
                sum += non[3];

            else if (val.equals("T"))
                sum += non[4];

            else if (val.equals("9") && suit.equals(B))
                sum += dom[5];
        }
        System.out.println(sum);
        in.close();
    }
}
