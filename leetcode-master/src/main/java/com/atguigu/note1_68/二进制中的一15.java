package com.atguigu.note1_68;

public class 二进制中的一15 {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0;i <32;i ++){
            if((n & 1) != 0){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }
}
