import java.util.Arrays;
import java.util.List;

public class It {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.forEach(num -> {
            num = null;
        });

    }
}
