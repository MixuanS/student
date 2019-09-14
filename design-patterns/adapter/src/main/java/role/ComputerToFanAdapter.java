package role;

/**
 * 电脑电源转风扇电源适配器
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/9/14
 */
public class ComputerToFanAdapter extends FanPowerSupply{
    private ComputerPowerSupply computerPowerSupply;

    public ComputerToFanAdapter(ComputerPowerSupply computerPowerSupply){
        this.computerPowerSupply = computerPowerSupply;
    }
}
