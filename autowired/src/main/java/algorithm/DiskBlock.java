package algorithm;

import lombok.Data;

/**
 * 磁盘块
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/7/22
 */
@Data
public class DiskBlock {
    /**
     * 关键字
     * 关键字数 = 节点引用数 - 1
     */
    private String[] keyword;

    /**
     * 数据区:存储到目标数据的地址
     */
    private String dataArea;

    /**
     * 节点引用
     */
    private String[] bodeReference;
}
