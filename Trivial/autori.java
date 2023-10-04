import java.util.Scanner;

class autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String input = in.nextLine();
        
        String[] inputs = input.split("-");
        
        for (int i = 0; i < inputs.length; i++) {
            char c = inputs[i].charAt(0);
            System.out.print(c);
        }
    }
}