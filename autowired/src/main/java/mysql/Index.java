package mysql;

import org.springframework.stereotype.Component;

/**
 * 索引的描述
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/7/22
 */
@Component
public class Index {

    /**
     * 自我介绍
     */
    public void selfIntroduction(){
        System.out.println();
    }

    /**
     * 索引的作用
     */
    public void effect(){
        System.out.println("加速对表中数据行的检索而创建的一种分散存储的数据结构");
    }

    /**
     * 为何使用索引
     * 索引是如何优化查询的
     */
    public void whyUse(){
        System.out.println("1.减少存储引擎需要扫描的数据量");
        System.out.println("2.随机IO-->顺序IO");
        System.out.println("3.分组、排序等操作时,避免使用零时表");

    }

    /**
     * 算法的实现
     */
    public void algorithmImplementation(){
        binarySearchTree();
        binarySearchBalanceTree();
    }

    /**
     * 二叉查找树
     */
    public void binarySearchTree(){
        System.out.println("二叉查找树");
    }

    /**
     * 二叉查找平衡数
     */
    public void binarySearchBalanceTree(){
        System.out.println("二叉查找平衡树:左自旋");
    }

    public void redBlackTree(){
        System.out.println("红黑树:定义更复杂的平衡二叉树");
    }
    /**
     * 高度差
     */
    public void heightDifference(){
        System.out.println("高度差是指一个节点下左右子节点数差");
    }
}
