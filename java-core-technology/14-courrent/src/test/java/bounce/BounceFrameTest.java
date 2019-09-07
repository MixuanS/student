package bounce;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class BounceFrameTest {
    @Test
    public void tt(){
        String a = "hello";
        int c = 100;
        System.out.println(a.indexOf(c));
    }

    /**
     * 冒泡排序
     */
    @Test
    public void bubbleSort(){
        int[] coll = {5,9,1,2,4,3,6,7};
        for (int i = 0; i < coll.length; i++) {
            for (int j = 1; j < coll.length; j++) {
                if (coll[j]>coll[j-1]){
                    int temp = coll[j-1];
                    coll[j-1] = coll[j];
                    coll[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(coll));
    }

    // 直接插入排序的原理：先将原序列分为有序区和无序区，然后再经过比较和后移操作将无序区元素插入到有序区中。

    /**
     * 直接插入排序
     */
    @Test
    public void directInsertionSort(){
        int[] coll = {5,9,1,2,4,3,6,7};
        for (int i = 1; i < coll.length; i++) {
            int temp = coll[i];
            int j = i - 1;
            while (j >0 && coll[j] > temp){
                coll[j+1] =  coll[j];
                j--;
            }
            coll[j+1] = temp;
        }
        System.out.println(Arrays.toString(coll));
    }


    /**
     * 二分插入排序
     */
    @Test
    public void binaryInsertionSort(){
        String str = new String("good");
        char[] ch = {'a','b','c'};
        System.out.println(str);
        System.out.println(ch);

    }
}