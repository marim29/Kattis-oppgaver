import java.util.Scanner;
import java.util.*;

class cutthenegativity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<int[]> arr = new ArrayList<int[]>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int t = in.nextInt();
                if (!(t == -1)) {
                    int list[] = {i+1, j+1, t};
                    arr.add(list);
                }
            }
        }

        System.out.println(arr.size());
        for (int i[] : arr) {
          for (int k : i) {
            System.out.print(k + " ");
          }
          System.out.print("\n");
            // System.out.println(Arrays.toString(i));
        }
    }
}
