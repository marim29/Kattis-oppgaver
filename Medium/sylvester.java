import java.util.Scanner;

public class Main {
    public static int val(int x, int y, long n) {
        int v = 1;
        while ((n & 1) == 0) {
            n >>= 1;
            if (x < n) {
                if (y >= n) y -= n;
            } else {
                x -= n;
                if (y >= n) {
                    y -= n;
                    v = -v;
                }
            }
        }
        return v;
    }

    public static void test_case() {
        long n;
        int x, y, w, h;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();

        for (int _y = y; _y < y + h; _y++) {
            if (w != 0) System.out.print(val(x, _y, n));
            for (int _x = x + 1; _x < x + w; _x++) {
                System.out.print(" " + val(_x, _y, n));
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            test_case();
        }
    }
}
