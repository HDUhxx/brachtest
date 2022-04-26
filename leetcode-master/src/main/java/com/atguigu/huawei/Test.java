package com.atguigu.huawei;

import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());
        int size1 = cin.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = cin.nextInt();
        }
        int size2 = cin.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = cin.nextInt();
        }
        int pairTarget = cin.nextInt();
        cin.close();

        System.out.println(getMinSum(array1, array2, pairTarget));
    }

    private static int getMinSum(int[] array1, int[] array2, int pairTarget) {
        // 在此补充你的代码
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                list.add(array1[i] + array2[j]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < pairTarget; i++) {
            res += list.get(i);
        }
        return res;
    }
}
