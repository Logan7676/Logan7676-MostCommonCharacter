import java.util.*;   
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap <Character, Integer> map = new HashMap<>();
        int count = 0;
        int maxCount=0;
        Character c = str.charAt(0);

        for(int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                map.put(str.charAt(i), count);
                count = 0;
            }
        }

        for (Map.Entry<Character, Integer> mp:map.entrySet()) {
            if (mp.getValue() > maxCount) {
                maxCount = mp.getValue();
            }
        }
        for (Map.Entry<Character, Integer> mp: map.entrySet()) {
            if (maxCount == mp.getValue()) {
                c = mp.getKey();
            }
        }
        return c;
    }
}
