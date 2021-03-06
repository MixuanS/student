package oom;

/**
 * 虚拟机栈和本地方法栈OOM测试
 * VM Args：-Xss128k
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF stackSof = new JavaVMStackSOF();
        stackSof.stackLeak();
    }
}
