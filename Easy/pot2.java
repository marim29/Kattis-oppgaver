import java.util.Scanner;

class pot {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int sum = 0;
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      int x = in.nextInt();
      int pow = x % 10;
      int num = x / 10;
      sum += Math.pow(num, pow);
    }
    System.out.println(sum);
  }
}
