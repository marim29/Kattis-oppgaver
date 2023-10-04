import java.util.Scanner;

class pet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numb = new int[5];
        int index = 0;

        for (int i = 0; i < 5; i++) {
          int sum = 0;
          for (int j = 0; j < 4; j++) {
              sum += in.nextInt();
          }
          numb[index] = sum;
          index++;
        }

        int deltaker = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {
          if (Math.max(max, numb[i]) == numb[i]) {
            deltaker = i+1;
            max = numb[i];
          }
        }
        System.out.print(deltaker + " " + max);
        in.close();
    }
}
