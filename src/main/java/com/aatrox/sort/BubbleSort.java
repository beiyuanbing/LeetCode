package com.aatrox.sort;

import com.aatrox.base.ArrayObject;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author aatrox
 * @desc 冒泡排序
 * @date 2020/5/28
 */
@Data
@Accessors(chain = true)
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

    public static void main(String[] args) {
        int[] nums=new int[]{9,5,1,7,3,6,1,4};
        new BubbleSort().setAsc(false).sort(nums);
    }
}
