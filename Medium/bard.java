import java.util.*;

public class bard {
  public static void main(String[] args) {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    int N = Integer.parseInt(in.readLine()); // number of villagers
    long[] songs = new long[N];
    int total = 0;
    int E = Integer.parseInt(in.readLine()); // number of evenings

    for (int i = 0; i < E; i++) {
      StringTokenizer st = new StringTokenizer(in.readLine());
      int k = Integer.parseInt(st.nextToken());

      ArrayList<Integer> now = new ArrayList<Integer>();
      while (st.hasMoreTokens()) {
        int v = Integer.parseInt(st.nextToken());
        now.add(v);
      }
      if (!now.contains(1)) {
        for (int u = 0; u < now.size(); u++) {
          for ( int v = u+1; v < now.size(); v++) {
            songs[now.get(u) -1]
          }
        }
      }
    }
  }
}

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
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < numPresent; j++) {
                int part = in.nextInt();
                list.add(part);
            }

            if(!list.contains(1)) {
              for (int u = 0; u < list.size(); u++) {
                for (int v = u + 1; v < list.size(); v++) {
                  knowsAllSongs.get(list.get(u) -1) |= songs.get(list.get(v) -1);
                  knowsAllSongs.get(list.get(v) -1) |= songs.get(list.get(u) -1);
                }
              }
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





        for (int i = 0; i < E; i++) {
            int numPresent = in.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < numPresent; j++) {
                int part = in.nextInt();
                list.add(part);
            }

            if(!list.contains(1)) {
              for (int u = 0; u < list.size(); u++) {
                for (int v = u + 1; v < list.size(); v++) {
                  knowsAllSongs.get(list.get(u) -1) |= songs.get(list.get(v) -1);
                  knowsAllSongs.get(list.get(v) -1) |= songs.get(list.get(u) -1);
                }
              }
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
