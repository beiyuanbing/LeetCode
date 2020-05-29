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

    /**
     * 拷贝数组，目标边缘的right也要拷贝
     * @param source
     * @param left
     * @param right
     * @return
     */
    public int[] copyArray(int[] source,int left,int right) {
        int[] nums = new int[right-left+1];
        System.arraycopy(source, left, nums, 0, nums.length);
        return nums;
    }

    /**
     * 数组拷贝，不算右边界值
     * @param source
     * @param left
     * @param right
     * @return
     */
    public int[] copyArrayRange(int[] source,int left,int right){
        int[] nums=new int[right-left];
        System.arraycopy(source, left, nums, 0, nums.length);
        return nums;
    }
}
