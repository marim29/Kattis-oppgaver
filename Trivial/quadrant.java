import java.util.Scanner;

class quadrant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int koord1 = in.nextInt();
        int koord2 = in.nextInt();
        
        if ((koord1 > 0) && (koord2 > 0)) {
            System.out.println("1");
        }
        else if ((koord1 > 0) && (koord2 < 0)) {
            System.out.println("4");
        }
        else if ((koord1 < 0) && (koord2 > 0)) {
            System.out.println("2");
        }
        else if ((koord1 < 0) && (koord2 < 0)) {
            System.out.println("3");
        }
    }
}