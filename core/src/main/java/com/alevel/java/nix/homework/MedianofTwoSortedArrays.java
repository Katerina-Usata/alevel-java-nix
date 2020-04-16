package com.alevel.java.nix.homework;

public class MedianofTwoSortedArrays {
    static int[] nums1 = new int[]{};
    static int[] nums2 = new int[]{1, 2, 5, 14};

    public static void main(String args[]) {
        int n = nums1.length;
        int m = nums2.length;

        // O(log(min(n,m)))
        if (n < m)
            System.out.print("The median is : " +
                    findMedianSortedArrays(n, m));
        else
            System.out.print("The median is : " +
                    findMedianSortedArrays(m, n));
    }

    // Функция для нахождения макс
    static int maximum(int a, int b) {
        return a > b ? a : b;
    }

    // Функция для нахождения мин
    static int minimum(int a, int b) {
        return a < b ? a : b;
    }

    //Нахождение медианы
    static double findMedianSortedArrays(int n, int m) {

        int min_index = 0;
        int max_index = n;
        int i = 0, j = 0;
        int median = 0;

        while (min_index <= max_index) {
            i = (min_index + max_index) / 2;
            j = ((n + m + 1) / 2) - i;
            if (i < n && j > 0 && nums2[j - 1] > nums1[i])
                min_index = i + 1;
            else if (i > 0 && j < m && nums2[j] < nums1[i - 1])
                max_index = i - 1;
            else {

                if (i == 0)
                    median = nums2[j - 1];
                else if (j == 0)
                    median = nums1[i - 1];
                else
                    median = maximum(nums1[i - 1],
                            nums2[j - 1]);
                break;
            }
        }
        if ((n + m) % 2 == 1)
            return (double) median;
        if (i == n)
            return (median + nums2[j]) / 2.0;
        if (j == m)
            return (median + nums1[i]) / 2.0;

        return (median + minimum(nums1[i],
                nums1[j])) / 2.0;
    }
}


