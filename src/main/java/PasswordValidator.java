import java.util.Set;

public final class PasswordValidator {
    static final Set<String> commonPasswords = Set.of("password", "Passwort1", "12345678", "Aa345678");

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
        // without regex
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        if (password != null) {
            for (int i = 0; i < password.length(); i++) {
                char current = password.charAt(i);
                if (Character.isLowerCase(current)) {
                    hasLowercase = true;
                } else if (Character.isUpperCase(current)) {
                    hasUppercase = true;
                }
                if (hasLowercase && hasUppercase) break;
            }
        }
        return hasLowercase && hasUppercase;
    }

    public static boolean isCommonPassword(String password) // small internal list
    {
        boolean result = false;
        if (password == null) {
            result = true;
        } else {
            for (String commonPass : commonPasswords) {
                if (commonPass.trim().equalsIgnoreCase(password.trim())) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    // Optional:
    public static boolean isValid(String password) // uses the checks above
    {
        return !isCommonPassword(password) && containsUpperAndLower(password) && containsDigit(password) && hasMinLength(password, 8);
    }

    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed) {
        return false;
    }

}