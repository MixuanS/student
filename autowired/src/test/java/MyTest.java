import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hc
 * @version 1.0.0
 * @date 2019/7/12
 */
public class MyTest {
    @Test
    public void tt(){
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(null,null);
        System.out.println(hashMap);
    }
}
