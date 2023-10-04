import java.util.Scanner;  // Import the Scanner class

class oddities {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            int tall = scan.nextInt();
            if (tall % 2 == 0) {
                System.out.println(tall + " is even");
            }
            else {
                System.out.println(tall + " is odd");
            }
        }
    }
}