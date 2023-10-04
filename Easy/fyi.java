import java.util.Scanner;

class fyi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String sub = s.substring(0,3);
        if (sub.equals("555")) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
