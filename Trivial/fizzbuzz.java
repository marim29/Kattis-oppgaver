import java.util.Scanner;

class fizzbuzz {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % X == 0) {
              if (i % Y == 0) {
                System.out.println("FizzBuzz");
              }
              else {
                System.out.println("Fizz");
              }
            }
            else if (i % Y == 0) {
              System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
