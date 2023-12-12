package src;

public class PasswordValidater {

    private int minLength;
    private int maxLength;
    private boolean numbersRequired;

    public PasswordValidater(int minLength, int maxLength, boolean numbersRequired)
    {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public boolean isValid(String password)
    {
        boolean hasDigit = false;
        boolean hasUpperCase = false;

        if(password.length() < maxLength || password.length() > minLength)
        {
            for (int i = 0; i < password.length(); i++)
            {
                char c = password.charAt(i);
                if(Character.isDigit(c)) {
                    hasDigit = true;
                } else if(Character.isUpperCase(c)) {
                    hasUpperCase = true;
                }
            }
        return hasDigit && hasUpperCase;
        }
        return false;
    }

}
