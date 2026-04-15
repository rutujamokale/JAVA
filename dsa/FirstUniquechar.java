public class FirstUniquechar {
    
    public static int firstUniquechar(String s) {
        
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
    }
}
