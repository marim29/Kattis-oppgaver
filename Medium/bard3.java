import java.util.*;


class bard3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        // int bard = 1;
        // ArrayList<Integer> knowsAllSongs = new ArrayList<>();
        // knowsAllSongs.add(bard);

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 1; i < N; i++) {
          map.put(i, new HashSet<Integer>());
        }
        int E = in.nextInt();
        int bardKnows = 0;

        for (int i = 0; i < E; i++) {
          String[] vil = in.nextLine().split(" ");
          boolean bard = false;
          for (int j = 1; j < vil.length; j++) {
            if (vil[j].equals("1")) {
              bard = true;
              break;
            }
          }
          if (bard) {
            ++bardKnows;
            for (int j = 1; j < vil.length; j++) {
              map.get(Integer.parseInt(vil[j])).add(bardKnows);
            }
          } else {
            HashSet<Integer> all = new HashSet<>();
            for (int j = 1; j < vil.length; j++) {
              all.addAll(map.get(Integer.parseInt(vil[j])));
            }
            for (int j = 1; j < vil.length; j++) {
              map.get(Integer.parseInt(vil[j])).addAll(all);
            }
          }
        }
        int max = map.get(1).size();
        for (int i = 1; i <= N; i++) {
          if (map.get(i).size() == max) {
            System.out.println(i);
          }
      }
    }
}
