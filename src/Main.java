package src;

public class Main {

    public static void main(String[] args) {
        PasswordValidater passwordValidater = new PasswordValidater(3, 20, true);
        System.out.println(passwordValidater.isValid("Michella29"));
        System.out.println(passwordValidater.isValid("hellothere2"));
        System.out.println(passwordValidater.isValid("hellOthere"));
    }
}
