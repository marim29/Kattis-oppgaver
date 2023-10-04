import java.util.Scanner;

class greetings2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int numE = 0;

        for (int i = 0; i < input.length(); i++) {
          char c = input.charAt(i);
          char e = 'e';
          if (c == e) {
              numE++;
            }
        }

        System.out.print("h");
        for (int j = 0; j < (2*numE); j++) {
            System.out.print("e");
          }
        System.out.print("y");
    }
}
