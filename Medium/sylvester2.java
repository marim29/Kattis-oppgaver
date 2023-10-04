import java.util.Scanner;

class sylvester2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numCases = in.nextInt();

    for (int c = 0; c < numCases; c++) {
      int n = in.nextInt();
      int x = in.nextInt(); // column
      int y = in.nextInt(); // row
      int w = in.nextInt(); // width
      int h = in.nextInt(); // height

      int sqare = (int)Math.pow(2, n);

      int[][] hadamard = new int[sqare][sqare];
      hadamard[0][0] = 1;

      for (int k = 1; k < n; k+=k) {
        for (int i = 0; i < k; i++) {
          for (int j = 0; j < k; j++) {
            hadamard[i + k][j] = hadamard[i][j];
            hadamard[i][j + k] = hadamard[i][j];
            hadamard[i + k][j + k] = -hadamard[i][j];
          }
        }
      }

      for (int p = x; p < n; p++) {
        for (int q = y; q < n; q++) {
          System.out.print(hadamard[p][q] + " ");
        }
        System.out.println();
      }
    }
  }
}
