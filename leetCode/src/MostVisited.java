import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostVisited {
    public static void main(String[] args) {

        int markers = 5;
        List<Integer> list = Arrays.asList(2,4,1,3);
//      int[] arr = new int[]{2,4,1,3};

        getMostVisited(markers, list);
    }

    /*
    * return an INTEGER= most visited positions
         * the lowest numbered marker that I visited the most times
         * n= num of markers (1<=n<=1,000,000)
         * the array shows what marker I ran to
         * if [2,4,1,3] then ran 2->4, then 4->1, then 1->3
         * marker #2 has 3 visits
         *
         * */

        public static int getMostVisited(int n, List<Integer> sprints) {

            // setup map that is n long
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(i, 0);
            }

//        map key represents a marker-1, so map key 4 is marker #5
//        System.out.println(map); {0=0, 1=0, 2=0, 3=0, 4=0}

            // next, loop each substring like sprint[0] to sprint[1]
            for (int i = 0; i < sprints.size()-1; i++) {
                int start = sprints.get(i);
                int end = sprints.get(i+1);

                // loop from start to end, input into map
                // run forward like 2->4,1->3
                if(start<end) {
                    for (int j = start; j <= end; j++) {
                        int value = map.get(j - 1);
                        map.put(j - 1, value + 1);
                    }
                }

                // run back like 4->1
                if(end<start) {
                    for (int j = start; j >= end; j--) {
                        int value = map.get(j - 1);
                        map.put(j - 1, value + 1);
                    }
                }
            }

            System.out.println(map);
//        {0=2, 1=3, 2=3, 3=2, 4=0}
//        map is filled with each visit

//        find highest value in map
            int max = 0;
            int marker = 0;

            for (int i = 0; i < n; i++) {
                int current = map.get(i);
                if(current>max){
                    max=current;
                    marker=i+1;
                }
            }

            System.out.println("first marker at highest value: "+marker);
            return marker;
        }
}
