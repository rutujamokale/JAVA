
public class AlternatingChar {

    public static int alternatingChar(String s) {
        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }
        return deletions;
    }

    public static void main(String[] args) {
        String s = "AABAAB";

        int result = alternatingChar(s);
        System.out.println("minimum deletions requir:" + result);
    }
}
