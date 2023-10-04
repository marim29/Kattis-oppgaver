import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.*;

class bard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int E = in.nextInt();
        int bard = 1;
        ArrayList<Integer> knowsAllSongs = new ArrayList<>();
        knowsAllSongs.add(bard);

        for (int i = 0; i < E; i++) {
            int numPresent = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < numPresent; j++) {
                int part = in.nextInt();
                list.add(part);
            }

            if (list.contains(1)) {
                for (int l = 0; l < numPresent; l++) {
                    if (list.get(l) == 1) break;
                    else {
                        knowsAllSongs.add(list.get(l));
                    }
                }
            }
        }

        Collections.sort(knowsAllSongs);

        for (Integer singer : knowsAllSongs) {
          System.out.println(singer);
        }
    }
}
