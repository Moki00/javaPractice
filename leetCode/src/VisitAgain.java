import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisitAgain {

    public static void main(String[] args) {

        int markers = 5;
        List<Integer> list = Arrays.asList(2, 4, 1, 3);
//      int[] arr = new int[]{2,4,1,3};

        getMostVisited(markers, list);
    }

    /**
     * the lowest numbered marker that I visited the most times
     * the array shows what marker I ran to
     * if [2,4,1,3] then ran 2->4, then 4->1, then 1->3
     * marker #2 has 3 visits
     *
     * @param n       = num of markers (1<=n<=1,000,000)
     * @param sprints
     * @return an INTEGER of most visited markers
     */
    public static int getMostVisited(int n, List<Integer> sprints) {

        // setup map that is n long for each marker
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n + 1; i++) {
            map.put(i, 0);
        }

//        map key represents a marker-1, so map key 4 is marker #5
        System.out.println(map); // {... 1=0, 2=0, 3=0, 4=0, 5=0}

        // next, loop each substring like sprint[0] to sprint[1]
        // if 4 items, then 3 runs of 01,12,23
        for (int i = 0; i <= sprints.size() - 2; i++) {
            int start = sprints.get(i);
            int end = sprints.get(i + 1);

            // 2, 4, 1, 3... is 24,41,13= run, back, run

            // loop from start to end, input into map
            // run forward like 2->4,1->3
            if (start < end) {
                for (int j = start; j <= end; j++) {
                    int val = map.get(j);
                    map.put(j, val + 1);
                }
            }

            // run back like 4->1
            if (start > end) {
                for (int j = start; j >= end; j--) {
                    int val = map.get(j);
                    map.put(j, val + 1);
                }
            }
        }

        System.out.println(map); // {0=0, 1=2, 2=3, 3=3, 4=2, 5=0}
//        map is filled with each visit

//        find the highest value in map that comes first
        int location = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (max < map.get(i)) {
                max = map.get(i);
                location = i;
                System.out.println("Location: " + i + ". This value is: " + map.get(i) + ". Max is: " + max);
            }
        }

        System.out.println("the first highest marker is: " + location);
        return location;
    }
}
