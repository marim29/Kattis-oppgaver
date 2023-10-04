import java.util.Scanner;

class electricaloutlets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            int K = in.nextInt();
            
            int sum = 0;
            for (int j = 0; j < K; j++) {
                sum += in.nextInt();
            }
            System.out.println(sum+1-K);
        }
        
    }
}