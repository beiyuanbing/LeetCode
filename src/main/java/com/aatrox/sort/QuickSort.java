package com.aatrox.sort;

import com.aatrox.base.ArrayObject;

/**
 * @author aatrox
 * @desc 快速排序就是建立一个基准值，一开始以第一个为基准值
 * 然后定义两个下标变量，从左右进行夹击，左边i找到比基准值大的，右边j找到比基准值小的
 * 然后进行交换两个值，然后继续走这段逻辑，直到把所有的小的交换到左边，大的交换到右边
 * 然后将基准值换到最中间去就是i的位置了，走完整个流程，左边还不是有序，右边也不是有序的
 * 进行拆分成left-i,i-right两块区域，递归走这样的逻辑，这样子不断分治交换的结果就是最终快速排序的
 *
 * 算法分析
 * 最佳情况：T(n) = O(nlogn)
 * 最差情况：T(n) = O(n2)
 * 平均情况：T(n) = O(nlogn)
 * @date 2020/6/1
 */
public class QuickSort extends ArrayObject {
    @Override
    public int[] sort(int[] nums) {
        sortKernel(nums,0,nums.length-1);
        toStringInt(nums);
        return nums;
    }

    public void sortKernel(int[] nums,int left,int right){
        if(left>right){
            return;
        }
        int i=left;
        int j=right;
        while (i<j){
            while (i<j&&nums[j]>=nums[left]){
                j--;
            }
            while(i<j&&nums[i]<=nums[left]){
                i++;
            }
            if(i<j){
                swap(nums,i,j);
            }
            toStringInt(nums);
        }
        //array[i]的位置的数最后一定是比基准值大的，加上判断也可以，没有任何影响
        //将基准放到中间后，左边的数字就是比基准小的，右边的一定比基准大
        //nums[left]就是一开始基准值,把它换到中间去
        swap(nums, left, i);
        toStringInt(nums);
        sortKernel(nums,left,i-1);
        sortKernel(nums,i+1,right);
    }


}
