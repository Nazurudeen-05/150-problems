import java.util.*;

public class p60 {
    public static void main(String[] args) {
        int[] arr = {50,120,50,10,10,20,30};

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
