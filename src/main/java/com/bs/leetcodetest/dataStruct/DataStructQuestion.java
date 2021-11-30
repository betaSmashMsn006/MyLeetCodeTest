package com.bs.leetcodetest.dataStruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructQuestion {

    //    https://leetcode-cn.com/problems/3sum
//    三数之和为0 经典题目 需要先排序再通过左右指针遍历寻找解
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums==null || nums.length<3) {
            return new ArrayList<>();
        }
//        先排序
        Arrays.sort(nums);
        for (int l=0;l<nums.length;l++) {
//            避免重复
            if (l>0 && nums[l]==nums[l-1]) {
                continue;
            }
            if (nums[l]>0) {
//                最左边的也大于0 必定不可能成功
                break;
            }
            int mid = l+1;
            int r = nums.length-1;
            if (mid>=r) {
                break;
            }
            while (mid<r) {
                if (nums[l]+nums[mid]+nums[r]==0) {
                    List<Integer> tempValue = new ArrayList<>();
                    tempValue.add(nums[l]);
                    tempValue.add(nums[mid]);
                    tempValue.add(nums[r]);
                    result.add(tempValue);
//                    去掉重复的
                    while (mid<r && nums[mid]==nums[mid+1]) mid++;
                    while (mid<r && nums[r]==nums[r-1]) r--;
                    r--;
                    mid++;
                } else if (nums[l]+nums[mid]+nums[r]<0) {
                    mid++;
                } else {
                    r--;
                }
            }

        }

        return result;
    }
}
