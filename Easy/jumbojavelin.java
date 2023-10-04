import java.util.Scanner;

class jumbojavelin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            count+=num;
            if (i == N-1) break;
            count-= 1;
        }
        System.out.println(count);
    }
}
