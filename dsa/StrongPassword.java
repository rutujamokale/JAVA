public class StrongPassword {
    public static int minimumNumber(String password) {
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        String special = "!@#%^&*()-+";

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (special.indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        int missing = 0;

        if (!hasDigit)
            missing++;
        if (!hasLower)
            missing++;
        if (!hasUpper)
            missing++;
        if (!hasSpecial)
            missing++;

        return Math.max(missing, 6 - password.length());
    }
    
    public static void main(String[] args) {
        String password = "Ab1";
        System.out.println(minimumNumber(password));
    }
}
