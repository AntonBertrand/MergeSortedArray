package com.example.mypackage;

import java.util.Arrays;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = m;

        for (int num : nums2) {
            nums1[counter] = num;
            counter++;
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }

}