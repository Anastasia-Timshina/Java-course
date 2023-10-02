package homework1;

public class UserRegistration {

    public static boolean registerUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login format");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Wrong password format");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match");
        }

        return true;
    }

    /*public static void main(String[] args) {
        try {
            boolean result = UserRegistration.registerUser("username", "password123", "password123");
            System.out.println("User registration successful");
        } catch (WrongLoginException e) {
            System.out.println("Wrong login format: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password format: " + e.getMessage());
        }
    }*/
}
