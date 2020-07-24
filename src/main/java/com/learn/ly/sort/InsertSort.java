package com.learn.ly.sort;

import java.util.Arrays;

/**
 * @Description 插入排序
 * @auther leiyang
 * @create 2020-06-30 15:26
 */
public class InsertSort {

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
     * 插入排序
     */
    public static void insertSort() {
	long start = System.currentTimeMillis();
	System.out.println("选择排序....");
	int size = datas.length;
	for (int i = 0; i < size - 1; i++) {
	    for (int j = i + 1; j < size - 1; j++) {
		int num = datas[j];
		if(datas[j] < datas[i]){


		}
	    }
	}

	System.out.println(String.format("消耗了[%d]毫秒。", System.currentTimeMillis() - start));
    }

    public static void main(String[] args) {

	//插入排序
	insertSort();
    }
}
