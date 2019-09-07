package algorithm;

/**
 * 二叉平衡树
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/7/22
 */
public class BinarySearchBalanceTree {
    private DiskBlock diskBlock;

    public void disadvantage(){
        System.out.println("树太深了,所以IO操作耗时大.基本上所有的访问到会到7-11层之间");
        System.out.println("磁盘块(DiskBlock)保存的数据量太小了:操作系统每次读取硬盘的数据为4K,而一个磁盘块的大小不足4K,所有没有很好的利用到操作系统");
        System.out.println("没有很好的利用到磁盘IO的预读能力(空间局部性原理),从而带来频繁的IO操作");
    }

    /**
     * 保持树平衡的规则
     */
    public void keepBalance(){

    }
}
