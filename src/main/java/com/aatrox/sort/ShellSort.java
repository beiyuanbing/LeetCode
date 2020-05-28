package com.aatrox.sort;

import com.aatrox.base.ArrayObject;

/**
 * @author aatrox
 * @desc 哈希排序
 * 希尔排序也是一种插入排序，它是简单插入排序经过改进之后的一个更高效的版本，也称为缩小增量排序，同时该算法是冲破O(n2）的第一批算法之一。
 * 它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 * 最佳情况：T(n) = O(nlog2 n)
 * 最坏情况：T(n) = O(nlog2 n)
 * 平均情况：T(n) =O(nlog2n)
 * @date 2020/5/28
 */
public class ShellSort extends ArrayObject {
    @Override
    public int[] sort(int[] nums) {
        for(int grap=nums.length/2;grap>0;grap--){
            for(int i=0;i+grap<nums.length;i++){
                int temp=nums[i+grap];
                int preIndex=i;
                while (preIndex>=0&&nums[preIndex]>temp){
                    nums[preIndex+grap]=nums[preIndex];
                    preIndex-=grap;
                }
                nums[preIndex+grap]=temp;
                toStringInt(nums);
            }
        }

        return new int[0];
    }
}
