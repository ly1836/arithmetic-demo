package com.learn.ly.sort;

import java.util.*;

/**
 * @Description 冒泡排序
 * @auther leiyang
 * @create 2020-06-30 15:26
 */
public class BubbleSort {

    private static int[] datas = {86, 913, 216, 951, 678, 311, 555, 343, 638, 138};

    static {
	System.out.println("随机生成10个小于1000整数集合.");
        /*Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            datas[i] = random.nextInt(1000);
        }*/
	System.out.println(Arrays.toString(datas));
	System.out.println("-------------------------------------------------");
    }

    /**
     * 冒泡排序
     */
    private static void bubbleSort() {
	long start = System.currentTimeMillis();
	System.out.println("冒泡排序....");
	int size = datas.length;
	int count = 0;
	for (int i = 0; i < size; i++) {
	    // 为什么要规定size - 1，因为下面比较是采用的是j+1，不减一数组下标越界
	    // 为什么要规定size - i，因为在第i遍排序完成后，最大数已经放在了数组最后面，在第j次比较中就不用再比较这个最大数
	    for (int j = 0; j < size - 1 - i; j++) {
		if (datas[j + 1] < datas[j]) {
		    Integer varInt = datas[j];
		    datas[j] = datas[j + 1];
		    datas[j + 1] = varInt;
		    count++;
		}
	    }

	    System.out.println(Arrays.toString(datas));
	}

	System.out.println(String.format("消耗了[%d]毫秒。", System.currentTimeMillis() - start));
    }

    public static void main(String[] args) {
	// 冒泡排序
	bubbleSort();
    }
}
