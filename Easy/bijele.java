import java.util.Scanner;
public class bijele {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] def = {1 , 1 , 2 , 2 , 2 , 8};
    int[] numb = new int[6];

    for (int i = 0; i < numb.length; i++) {
        numb[i] = in.nextInt();
    }
    
    for (int i = 0; i < numb.length; i++) {
        System.out.print(def[i] - numb[i] + " ");
    }
    in.close();
    }
}