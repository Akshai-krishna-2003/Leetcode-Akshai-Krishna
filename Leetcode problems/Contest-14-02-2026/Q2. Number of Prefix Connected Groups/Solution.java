import java.util.HashMap;

public class Solution {
    public int prefixConnected(String[] words, int k) {
        int finalResult = 0;

        HashMap<String, Integer> subStringMap = new HashMap<>();

        // We make a map of substring first
        for (String word : words) {
            String changedString = word.substring(0, k - 1);
            if (subStringMap.keySet().contains(changedString))
                continue;

            subStringMap.put(changedString, 0);
        }

        for (String word : words) {
            if (subStringMap.containsKey(word.substring(0, k - 1))) {
                subStringMap.put(word.substring(0, k - 1), 1);
            }
        }

        System.out.println(subStringMap);

        for (Integer i : subStringMap.values()) {
            finalResult += i;
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = { "apple", "apply", "banana", "bandit" };
        int k = 2;
        int result = sol.prefixConnected(words, k);
        System.out.println(result);
    }
}
