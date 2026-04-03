
public class fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int first = 0;
        int second = 1;

        if (n == 0) {
        System.out.println(first);
    } else if (n == 1) {
       
          System.out.println(second);
      } else {
          for (int i = 2; i <= n; i++) {
              int next = first + second;
              first = second;
              second = next;
          }

      }
     System.out.println(second);
                
    }
}
    //n=10;
