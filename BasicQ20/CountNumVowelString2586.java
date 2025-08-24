package BasicQ20;

public class CountNumVowelString2586 {
    public static void main(String[] args) {
        CountNumVowelString2586 countNumVowelString2586 = new CountNumVowelString2586();
        String[] words = { "are", "army", "u" };
        System.out.println(countNumVowelString2586.vowelStrings(words, 0, 2));
    }

    public int vowelStrings(String[] words, int left, int right) {
        
        char[] vowels = {'a','e','i','o','u'};

        int count = 0;

        for (int i = left; i <= right; i++) {
            
            String word = words[i];

            if (word.isEmpty()) continue;
            
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            if (isVowel(first, vowels) && isVowel(last, vowels)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char c, char[] vowels) {
        for (char v : vowels) {
            if (v == Character.toLowerCase(c)) {
                return true;
            }
        }

        return false;
    }
}
