import java.util.Scanner;
import java.util.*;

class Succession {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        String founder = in.next();

        HashMap<String, HashSet<String>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String st = in.next();

            HashSet<String> parents = new HashSet<>();
            String p1 = in.next();
            String p2 = in.next();
            parents.add(p1);
            parents.add(p2);

            map.put(st, parents);
        }

        String[] claimers = new String[M];
        for (int j = 0; j < M; j++) {
            claimers[j] = in.next();
            System.out.println(claimers[j]);
        }

        // for (String claimer : claimers) {
        //   for (int i = 0; i < claimers.length; i++) {
        //     if (map.get(claimer).contains(claimers[i])) break;
        //     else {
        //       System.out.println(claimer);
        //     }
        //   }
        // }
    }
}
//
//     // Finner om en person er
//     String isAnchestor(String s, HashMap<String, HashSet<String>> map, String[] claimers) {
//          HashSet<String> set = map.get(s);
//
//
//       }
//
//          String[] parents = set.toArray(new String[set.size()]);
//          for (int i = 0; i < parents.length; i++) {
//            if (parents[i] == "Andrew") break;
//            else {
//              isAnchestor(parents[i]);
//            }
//          }
//     }
// }
