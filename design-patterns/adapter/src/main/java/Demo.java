import role.ComputerPowerSupply;
import role.ComputerToFanAdapter;
import role.Fan;

/**
 * demo
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/9/14
 */
public class Demo {
    public static void main(String[] args) {
        // 创建一个电脑电源,将其转换为风扇电源
        ComputerToFanAdapter computerToFanAdapter = new ComputerToFanAdapter(new ComputerPowerSupply());
        // 放入风扇中
        Fan fan = new Fan(computerToFanAdapter);
        fan.work();
    }
}
