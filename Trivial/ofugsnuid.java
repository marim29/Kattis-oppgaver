import java.util.Scanner;
import java.util.*;

class ofugsnuid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            stack.push(k);
        }
        for (int j = 0; j < n; j++) {
          int tall = stack.pop();
          System.out.println(tall);
        }
    }
}
