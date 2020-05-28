package com.aatrox.sort;

import com.aatrox.base.ArrayObject;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author aatrox
 * @desc 选择排序时间
 * 最佳情况：T(n) = O(n2)
 * 最差情况：T(n) = O(n2)
 * 平均情况：T(n) = O(n2)
 * @date 2020/5/28
 */
@Data
@Accessors(chain = true)
public class SelectionSort extends ArrayObject {
    /**是否是正序排，从小到大**/
    private boolean asc=true;
    /**两头大小选择的方式***/
    private boolean twoSide=false;
    @Override
    public int[] sort(int[] nums) {
        /***两头插入的方式**/
        if(twoSide){
            return twoSideSelectionSort(nums);
        }
        for(int i=0;i<nums.length;i++){
            if(asc) {
                int swap_index = i;
                /***小的排在前面**/
                for (int j = i; j < nums.length; j++) {
                    if (nums[swap_index] > nums[j]) {
                        swap_index = j;
                    }
                }
                swap(nums, swap_index, i);
            }else{
                //最大值位置默认为待插入的最后一个
                int swap_index = nums.length-i-1;
                /***大的排在前面**/
                for(int j=0;j<nums.length-i;j++){
                    if (nums[swap_index] < nums[j]) {
                        swap_index = j;
                    }
                }
                swap(nums, swap_index, nums.length-i-1);
            }
            toStringInt(nums);
        }
        return nums;
    }

    /**
     * 一次遍历选择出最大和最小的值，然后分别放到放到两边
     * @return
     */
    public int[] twoSideSelectionSort(int[] nums){
        int left=0;int right=nums.length-1;
        while (left<right){
            int min_index=left;
            int max_index=right;
            for(int j=left;j<=right;j++){
                if(nums[min_index]>nums[j]){
                    min_index=j;
                }
                if(nums[max_index]<nums[j]){
                    max_index=j;
                }
            }
            if(max_index==left){
                max_index=min_index;
            }
            swap(nums,min_index,left);
            swap(nums,max_index,right);
            left++;
            right--;
            toStringInt(nums);
        }
        return nums;
    }


}
