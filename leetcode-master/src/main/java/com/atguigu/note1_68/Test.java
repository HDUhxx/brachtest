package com.atguigu.note1_68;

public class Test {
    public int numWays(int n) {
        if (n < 2) return 1;
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    public int minArray(int[] numbers) {
        int  left = 0;
        int right = numbers.length - 1;
        while (left < right){
            int mid = left + (right - left)/2;
            if (numbers[mid] > numbers[right]){
                left = mid + 1;
            }else if (numbers[mid] < numbers[right]){
                right = mid;
            }
        }
        return numbers[left];
    }
}
