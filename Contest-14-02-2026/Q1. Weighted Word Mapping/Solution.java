import java.util.HashMap;
import java.util.Map;

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map<String, Integer> mapsVal = new HashMap<>();
        String[] alphabets = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };

        // Combined String
        String cString = "";

        // Putting valuees as "alphabet" -> "weights in maps"
        for (int i = 0; i < 26; i++) {
            mapsVal.put(alphabets[i], weights[i]);
        }

        Map<Integer, String> reverseMap = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            reverseMap.put(25 - i, String.valueOf((char) ('a' + i)));
        }

        System.out.println(mapsVal);

        for (int i = 0; i < words.length; i++) {
            int total = 0;

            for (int j = 0; j < words[i].length(); j++) {
                String val = String.valueOf(words[i].charAt(j));
                int v = mapsVal.get(val);
                total += v;
            }

            total = total % 26;

            cString = cString + reverseMap.get(total);
        }

        return cString;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = { "abcd", "def", "xyz" };
        int[] weights = { 5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2 };
        String result = solution.mapWordWeights(words, weights);
        System.out.println(result);
    }
}