import java.util.Scanner;

class conundrum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int days = 0;

        for (int i = 0; i < word.length(); i+=3) {
            if (word.charAt(i) == 'P') continue;
            else {
                days++;
            }
        }
        for (int i = 1; i < word.length(); i+=3) {
            if (word.charAt(i) == 'E') continue;
            else {
                days++;
            }
        }
        for (int i = 2; i < word.length(); i+=3) {
            if (word.charAt(i) == 'R') continue;
            else {
                days++;
            }
        }
        System.out.println(days);
        in.close();
    }
}
