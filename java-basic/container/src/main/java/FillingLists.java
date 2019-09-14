import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 填充List容器
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/9/13
 */
public class FillingLists {
    public static void main(String[] args) {
        ArrayList<StringAddress> list = new ArrayList<>(Collections.nCopies(2, new StringAddress("hechao")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("NB"));
        System.out.println(list);
    }
}
