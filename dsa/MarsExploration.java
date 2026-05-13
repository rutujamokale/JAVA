public class MarsExploration {
    public static int marsExploration(String s) {
        int changes = 0;
        String expected = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != expected.charAt(i % 3)) {
                changes++;
            }
        }
        return changes;

    }

    public static void main(String[] args) {
        String s = "SOSTOT";
        System.out.println(marsExploration(s));
    }
}

    