package com.aatrox.sort;

import com.aatrox.base.ArrayObject;

/**
 * @author aatrox
 * @desc 插入排序
 * 最佳情况：T(n) = O(n)
 * 最坏情况：T(n) = O(n2)
 * 平均情况：T(n) = O(n2)
 * 每一次都默认为前面的数据为有序的，然后选择适合他的位置进行插入
 * @date 2020/5/28
 */
public class InsertionSort extends ArrayObject {
    @Override
    public int[] sort(int[] nums) {
        if(nums==null||nums.length==0){
            return nums;
        }
        for(int i=0;i<nums.length-1;i++){
            int temp=nums[i+1];
            int preIndex=i;
            while (preIndex>=0&&nums[preIndex]>temp){
                nums[preIndex+1]=nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1]=temp;
            toStringInt(nums);
        }
        return nums;
    }
}
