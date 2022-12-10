package behavioral.chainofresponsibility;

public class UserStatusFilter implements Filter {

    @Override
    public boolean doFilter(User user) {
        System.out.println("UserStatusFilter: Checking if user is enabled.");
        return user.isEnabled();
    }
}
