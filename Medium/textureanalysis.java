import java.util.Scanner;
import java.util.*;

class textureanalysis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();
        int i = 1;

        String s = in.nextLine();
        while (!s.equals("END")) {
            if (s.equals("END")) break;
            if (map.containsKey(s)) {
              System.out.println(i + " " + map.get(s) + "\n");
            } else if (!s.contains(".")) {
              map.put(s, "EVEN");
              System.out.println(i + " EVEN");
            } else {
              int black = s.length() - line.replace("*", "").length();
              int white = line.indexOf('.');
              white = line.substring(white, line.indexOf('*', white)).length();
              String reg = "()"
            }

            i++;

        s = in.nextLine();

        }
        for (String or : evenornot) {
          System.out.println(or);
        }
    }
}
