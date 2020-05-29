package com.aatrox.sort;

import com.aatrox.base.ArrayObject;

/**
 * @author aatrox
 * @desc 归并排序
 * 和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，因为始终都是O(n log n）的时间复杂度。代价是需要额外的内存空间。
 * 归并排序 是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and
 * Conquer）的一个非常典型的应用。归并排序是一种稳定的排序方法。将已有序的子序列合并，得到完全有序的序列；
 * 即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。
 * 最佳情况：T(n) = O(n)
 * 最差情况：T(n) = O(nlogn)
 * 平均情况：T(n) = O(nlogn)
 * @date 2020/5/29
 */
public class MergeSort extends ArrayObject {
    @Override
    public int[] sort(int[] nums) {
        if(nums.length<2){
            return nums;
        }
        int middle=nums.length/2;
        //拷贝数组用的
        /*int[] array1=copyArray(nums,0,middle-1);
        int[] array2=copyArray(nums,middle,nums.length-1); */
        int[] array1=copyArrayRange(nums,0,middle);
        int[] array2=copyArrayRange(nums,middle,nums.length);
        //拷贝数组用的
        return merge(sort(array1),sort(array2));
    }



    public int[] merge(int[] array1,int[] array2){
        int[] nums=new int[array1.length+array2.length];
        int index=0;
        int i=0;
        int j=0;
        while (index <nums.length){
            if(i<array1.length&&j<array2.length&&array1[i]<=array2[j]){
                nums[index++]=array1[i++];
            }else if(i<array1.length&&j<array2.length&&array1[i]>array2[j]){
                nums[index++]=array2[j++];
            }else if(i<array1.length&&j>=array2.length){
                nums[index++]=array1[i++];
            }else{
                nums[index++]=array2[j++];
            }
        }
        return nums;
    }

}

