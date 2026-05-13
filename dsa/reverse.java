public class reverse {
    public static void Reverse(char[] s) {
        //madam

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = "madam";

        char[] arr = s.toCharArray();
        Reverse(arr);
        
        String reversed = new String(arr);
        System.out.println(reversed);
        
        }
    }

