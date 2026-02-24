public class Reverse{
    public static void main(String[] args) {
        String st = "hello";
        String res = "";

        for (int i = st.length() - 1; i >= 0; i--) {
            res += st.charAt(i);
        }

        System.out.println("reverse string:" + res);

    }
}