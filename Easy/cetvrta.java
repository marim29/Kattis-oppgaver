import java.util.Scanner;

class cetvrta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(); int y1 = in.nextInt(); int x2 = in.nextInt();
        int y2 = in.nextInt(); int x3 = in.nextInt(); int y3 = in.nextInt();
        
        int x4 = 0; int y4 = 0;
        
        if (x1 == x2) {
            x4 = x3;
        }
        else if (x1 == x3) {
            x4 = x2;
        }
        else if (x2 == x3) {
            x4 = x1;
        }
        
        if (y1 == y2) y4 = y3;
        else if (y1 == y3) y4 = y2;
        else if (y2 == y3) y4 = y1;
        
        System.out.print(x4+ " " +y4);    
    }
}