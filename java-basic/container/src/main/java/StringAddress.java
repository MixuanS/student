/**
 * bean对象
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/9/13
 */
public class StringAddress {
    private String s;

    public StringAddress(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}
