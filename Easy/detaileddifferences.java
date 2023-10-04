import java.util.Scanner;

class detaileddifferences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String a = in.next();
            String b = in.next();
            System.out.println(a);
            System.out.println(b);

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == b.charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }
    }
}
