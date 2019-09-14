package role;

/**
 * 风扇
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/9/14
 */
public class Fan {
    private FanPowerSupply fanPowerSupply;

    public Fan(FanPowerSupply fanPowerSupply){
        this.fanPowerSupply = fanPowerSupply;
    }
    public void work(){
        if (fanPowerSupply == null){
            System.out.println("电源不足");
        }else{
            System.out.println("风扇呼呼呼~~~");
        }
    }

}
