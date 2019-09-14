import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 填充容器
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/9/13
 */
public class FillContainer {
    public static void main(String[] args) {
        List<String> data = Collections.nCopies(10, "2");
        System.out.println(data);
        Collections.fill(data,"1");

        System.out.println(data);
    }
}
