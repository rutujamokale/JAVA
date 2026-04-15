public class MakingAnagrams {
    public static int makingAnagram(String s1, String s2) {
        int[] freq = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }

        int deletions = 0;
        for (int count : freq) {
            deletions += Math.abs(count);
        }
        return deletions;
    }
    
    public static void main(String[] args) {
        String s1 = "cde";
        String s2 = "abc";
        int result = makingAnagram(s1, s2);

        System.out.println("Minimum deletions required:" + result);
    }
}
