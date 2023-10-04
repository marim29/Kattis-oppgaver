import java.util.Scanner;

class digitswap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int two = a%10;
        int one = a/10;

        System.out.print(two);
        System.out.print(one);

    }
}
