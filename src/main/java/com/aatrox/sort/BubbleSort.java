package com.aatrox.sort;

import com.aatrox.base.ArrayObject;

/**
 * @author aatrox
 * @desc 冒泡排序
 * 最佳情况：T(n) = O(n)
 * 最差情况：T(n) = O(n2)
 * 平均情况：T(n) = O(n2)
 * @date 2020/5/28
 */
public class BubbleSort extends ArrayObject {

    /**是否是正序排，从小到大**/
    private boolean asc=true;

    @Override
    public int[] sort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            /****正序排序**/
            if(asc) {
                for (int j = nums.length - 1; j >= i; j--) {
                    if (j - 1 >= 0 && nums[j - 1] > nums[j]) {
                        swap(nums, j - 1, j);
                        toStringInt(nums);
                    }
                }
            }else{
                /*****大的放在后面**/
                for(int j=0;j<=nums.length-i-1;j++){
                    if (j + 1 <=nums.length-1  && nums[j +1] < nums[j]) {
                        swap(nums, j +1, j);
                        toStringInt(nums);
                    }
                }
            }
        }
        toStringInt(nums);
        return nums;
    }


}
