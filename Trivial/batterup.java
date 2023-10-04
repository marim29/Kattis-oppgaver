import java.util.Scanner;

class Batterup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float numb = 0;
        
        float n = in.nextFloat();

        float sum = 0;
        for (int i = 0; i < n; i++) {
            float k = in.nextFloat();
            if (k < 0) continue;
            numb++;
            sum+= k;
        }

        System.out.println(sum/numb);
    }
}
