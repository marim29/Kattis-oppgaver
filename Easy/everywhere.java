import java.util.Scanner;

class everywhere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int h = 0; h < T; h++) {
            int n = in.nextInt();
            String[] list = new String[n+1];
            int count = n;

            for (int i = 0; i <= n; i++) {
                String s = in.nextLine();
                list[i] = s;

                if (list[i] == null) {
                  break;
                }
                else if (list[i] == s) {
                  break;
                }
                else {
                  count--;
                }
              }
          System.out.println(count);
        }
      }
}
