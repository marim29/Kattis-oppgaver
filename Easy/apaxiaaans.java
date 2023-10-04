import java.util.Scanner;

class apaxiaaans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String n = "";
        if (s.length() == 1) {
            n = s;
        }
        else {
            for (int i = 0; i < s.length()-1; i++) {
                if (s.charAt(i) != s.charAt(i+1))
                    n+= s.charAt(i);
            }
            n += s.charAt(s.length()-1);
        }
        System.out.println(n);
        in.close();
    }
}
