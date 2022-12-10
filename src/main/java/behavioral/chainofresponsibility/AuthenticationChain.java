package behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationChain {

    private final List<Filter> filters;

    public AuthenticationChain() {
        this.filters = new ArrayList<>();
    }

    public void addNextFilter(Filter nextFilter) {
        filters.add(nextFilter);
    }

    public boolean authenticate(User user) {
        for (Filter filter : filters) {

            if (!filter.doFilter(user)) {
                System.out.println("Filter check failed!");
                return false;
            }
        }
        return true;
    }
}
