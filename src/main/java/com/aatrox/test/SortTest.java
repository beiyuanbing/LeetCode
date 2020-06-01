package com.aatrox.test;

import com.aatrox.base.ArrayObject;
import com.aatrox.sort.*;

/**
 * @author aatrox
 * @desc
 * @date 2020/5/28
 */
public class SortTest {
    public static void main(String[] args) {
        int[] nums=new int[]{9,5,1,7,3,6,1,4};
        /***冒泡排序***/
        //new BubbleSort().setAsc(false).sort(nums);
        /***选择排序***/
        //new SelectionSort().setTwoSide(false).setAsc(false).sort(nums);
        /****插入排序***/
        //new InsertionSort().sort(nums);
        /****哈希排序***/
        //new ShellSort().sort(nums);
        /****归并排序****/
        //ArrayObject.toStringInt(new MergeSort().sort(nums));
        /****快速排序***/
        new QuickSort().sort(nums);
    }
}
