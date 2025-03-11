package POO.Rpaso.LeetCode;

public class Solution {
    public String reverseVowels(String s){
        boolean [] isVowel = new boolean[128];

        for (char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }
        char[] characters = s.toCharArray();

        int i = 0, j = characters.length - 1;

        while (i < j){
            while ( i < j && !isVowel[characters[i]]){
                ++i;
            }
            while ( i < j && !isVowel[characters[j]]){
                --j;
            }
            if (i < j) {
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;

                ++i;
                --j;
            }
        }
        return  String.valueOf(characters);
    }
}
