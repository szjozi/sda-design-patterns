package behavioral.chainofresponsibility;

public class UsernameFilter implements Filter {

    @Override
    public boolean doFilter(User user) {
        System.out.println("Username Filter: Checking if user is equal or longer then 5 chars.");
        return user.username().length() >= 5;
    }
}
