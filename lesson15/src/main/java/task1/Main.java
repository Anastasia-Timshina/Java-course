package task1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user = new User("John");

        Optional<User> optionalUser = Optional.ofNullable(user);

        String userName = optionalUser.map(User::getName).orElse("DEFAULT");

        System.out.println(userName);
    }
}
