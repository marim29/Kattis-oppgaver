import java.util.Scanner;

class alphabetspam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ord = in.nextLine();
        double whitespace = 0;
        double lowercase = 0;
        double uppercase = 0;
        double symbols = 0;

        for (int i = 0; i < ord.length(); i++) {
          char r = ord.charAt(i);

          if (r == '_') {
                whitespace++;
          } else if (r >= 'a' && r <= 'z') {
              lowercase++;
          } else if (r >= 'A' && r <= 'Z') {
              uppercase++;
          } else {
              symbols++;
          }
        }
        System.out.println(whitespace/ord.length());
        System.out.println(lowercase/ord.length());
        System.out.println(uppercase/ord.length());
        System.out.println(symbols/ord.length());
    }
}
