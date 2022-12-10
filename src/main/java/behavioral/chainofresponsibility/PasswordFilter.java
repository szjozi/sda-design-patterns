package behavioral.chainofresponsibility;

public class PasswordFilter implements Filter {

    @Override
    public boolean doFilter(User user) {
        System.out.println("Password Filter: Checking if user password is equal to 'pass'.");
        return "pass".equals(user.password());
    }
}
