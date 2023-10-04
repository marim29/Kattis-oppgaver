import java.util.Scanner;

class lektira {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String word = in.next();
      double max = word.length();

      double num = max / 3;
      double split = Math.ceil(num);
      int split1 = (int) split;
      int split2 = 2 * split1;

      String part1 = word.substring(0, split1);
      String part2 = word.substring(split1, split2);
      String part3 = word.substring(split2);

      String p1_sorted = "";
      int backwards = part1.length()-1;

      for (int i = 0; i < part1.length(); i++) {
        p1_sorted += part1.charAt(backwards);
        backwards--;
      }

      String p2_sorted = "";
      int backwards2 = part2.length()-1;

      for (int i = 0; i < part2.length(); i++) {
        p2_sorted += part2.charAt(backwards2);
        backwards2--;
      }

      String p3_sorted = "";
      int backwards3 = part3.length()-1;

      for (int i = 0; i < part3.length(); i++) {
        p3_sorted += part3.charAt(backwards3);
        backwards3--;
      }

      String sorted = p1_sorted + p2_sorted + p3_sorted;
      System.out.println(sorted);

    }
}
