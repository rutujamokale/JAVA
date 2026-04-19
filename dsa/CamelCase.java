public class CamelCase{
    public static int camelcase(String s) {
        int words = 1;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                words++;
            }
        }
        return words;
    }

    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(camelcase(s));
    }
}