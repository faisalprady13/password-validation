public final class PasswordValidator {
    public static boolean hasMinLength(String password, int min) {
        return (password != null && password.replaceAll("\\s+", "").length() >= min);
    }

    public static boolean containsDigit(String password) {
        // without regex
        boolean result = false;
        if (password != null) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean containsUpperAndLower(String password) {
        return false;
    }

    public static boolean isCommonPassword(String password) // small internal list
    {
        return false;
    }

    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed) {
        return false;
    }

    // Optional:
    public static boolean isValid(String password) // uses the checks above
    {
        return false;
    }
}