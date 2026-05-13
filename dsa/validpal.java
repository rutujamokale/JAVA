public class validpal{
    public boolean isPalindrome(String s){

            s=s.toLowerCase().replaceAll("[^a-z0-9]", "");

            int left=0;
            int right=s.length()-1;


            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }

                left++;
                right--;
            }
            return true;
    }
    public static void main(String[] args) {    
          validpal v1=new validpal();
          String s="A man, a plan, a canal: Panama";
          System.out.println(v1.isPalindrome(s));
}
}
//A man, a plan, a canal: Panama";
