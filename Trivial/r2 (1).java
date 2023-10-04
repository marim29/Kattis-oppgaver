import java.util.Scanner;

class r2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R1 = in.nextInt();
        int S1 = in.nextInt();
        
        for (int i = -1000;i <= 1000; i++) {
            if ((R1 + i)/2 == S1) {
                System.out.println(i);
                break;
            }
        }
    }
}