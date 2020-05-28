package com.aatrox.base;

/**
 * @author aatrox
 * @desc
 * @date 2020/5/28
 */
public  abstract class ArrayObject implements SortInterface{
    /**
     * 数组的输出
     * @param nums
     */
    public static void toStringInt(int[] nums){
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
    }
    /**进行值交换**/
    public void swap(int[] nums, int a, int b){
        if(a==b){
            return;
        }
        nums[a]=nums[a]^nums[b];
        nums[b]=nums[a]^nums[b];
        nums[a]=nums[a]^nums[b];
      /*  int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;*/
    }

    public static void toStringInt(int[][] nums){
        for (int[] num:nums) {
            toStringInt(num);
        }
    }

    /**
     * 数组的拷贝
     *
     * @param array
     * @return
     */
    public int[] copyArray(int[] array) {
        int[] nums = new int[array.length];
        System.arraycopy(array, 0, nums, 0, array.length);
        return nums;
    }
}
