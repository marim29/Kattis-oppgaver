import java.util.Scanner;

class cold {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] tall = new int[n];

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            tall[i] = t;
          }
          
        int ant = 0;
        
        for (int u = 0; u < n; u++) {
            if (tall[u] < 0) {
                ant++;
            }
        }
        
        System.out.println(ant);
    }
}