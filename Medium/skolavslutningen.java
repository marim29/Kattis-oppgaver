import java.util.Scanner;
import java.util.HashMap;

class skolavslutningen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //lines
        int M = in.nextInt(); //columns
        int K = in.nextInt(); //classes
        char[][] array = new char[N][M];
        HashMap <char, String> map = new HashMap<char, String>();
        HashMap<char, HashSet<char>> adjList = new HashMap();
        for (int i = 0; i < K; i++) {
          adjList.put((char)'A' + i), new HashSet<char>();
        }

        for (int i = 0; i < N; i ++) {
          String s = in.next();
          for (int j = 0; j < M; j++) {
            char c = s.charAt(j);
            array[i][j] = c;
            map.put(c, "");
          }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (array[i][j] == array[i+1][j]) {
                  continue;
                } else {

                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
