package behavioral.chainofresponsibility;



public class Main {

    public static void main(String[] args) {

        AuthenticationChain filterChain = new AuthenticationChain();
        filterChain.addNextFilter(new UserStatusFilter());
        filterChain.addNextFilter(new UsernameFilter());
        filterChain.addNextFilter(new PasswordFilter());

        User disabledUser = new User("user1", "pass", false);
        User userWithInvalidUsername = new User("us", "pass", true);
        User userWithInvalidPass = new User("user3", "wrong pass", true);
        User validUser = new User("user4", "pass", true);

        boolean authenticated = filterChain.authenticate(disabledUser);
        System.out.println("Disabled user authenticated: " + authenticated);
        System.out.println("===========================================");

        authenticated = filterChain.authenticate(userWithInvalidUsername);
        System.out.println("User with invalid username authenticated: " + authenticated);
        System.out.println("===========================================");

        authenticated = filterChain.authenticate(userWithInvalidPass);
        System.out.println("User with invalid password authenticated: " + authenticated);
        System.out.println("===========================================");

        authenticated = filterChain.authenticate(validUser);
        System.out.println("Valid user authenticated: " + authenticated);

    }
}
