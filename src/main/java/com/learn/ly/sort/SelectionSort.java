package com.learn.ly.sort;

import java.util.Arrays;

/**
 * @Description 选择排序
 * @auther leiyang
 * @create 2020-06-30 15:25
 */
public class SelectionSort {

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
     * 选择排序
     */
    private static void selectionSort() {
	long start = System.currentTimeMillis();
	System.out.println("选择排序....");
	int size = datas.length;
	for (int i = 0; i < size - 1; i++) {
	    // 设定最小数下标
	    int minIndex = i;
	    //通过一遍排序选出最小数的下标
	    for (int j = i + 1; j < size; j++) {
		if (datas[j] < datas[minIndex]) {
		    minIndex = j;
		}
	    }

	    //进行最小数下标和当前遍历下标数进行交换
	    int varInt = datas[i];
	    datas[i] = datas[minIndex];
	    datas[minIndex] = varInt;
	    System.out.println(Arrays.toString(datas));
	}

	System.out.println(String.format("消耗了[%d]毫秒。", System.currentTimeMillis() - start));
    }


    public static void main(String[] args) {
	// 选择排序
	selectionSort();
    }
}
