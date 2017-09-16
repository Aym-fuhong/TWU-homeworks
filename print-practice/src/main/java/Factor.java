import java.util.ArrayList;
import java.util.List;

public class Factor {
    public String generate(int n) {
        List list = new ArrayList();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        return list.toString();
    }
}
