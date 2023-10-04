import java.util.Scanner;

class findingana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String sub = null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='a') {
              sub = str.substring(i);
              break;
            }
        }
        System.out.println(sub);
    }
}
