package oom;

import java.util.ArrayList;

/**
 * Java堆内存溢出异常测试
 * VM Args：-Xms20m-Xmx20m-XX：+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObject{

    }
    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<OOMObject>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
