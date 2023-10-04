import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matches = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();

        System.out.println(Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));

        while (matches-- > 0)
            System.out.println(sc.nextInt() <= Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)) ? "DA" : "NE");

        sc.close();
    }
}
