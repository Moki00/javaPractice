import java.util.*;

public class AmazoLogs {

    public static void main(String[] args) {

    }

    public static List<String> processLogs(List<String> logs, int threshold) {

        Map<String, Integer> map = new HashMap<>();
        for (String logLine : logs) {
            String[] log = logLine.split(" ");
            map.put(log[0], map.getOrDefault(log[0], 0) + 1);
            if (log[0] != log[1]) {
                map.put(log[1], map.getOrDefault(log[1], 0) + 1);
            }
        }

        List<String> userIds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= threshold) {
                userIds.add(entry.getKey());
            }
        }

        Collections.sort(userIds,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.parseInt(s1) - Integer.parseInt(s2);
            }
        });

        return userIds;
    }
}
