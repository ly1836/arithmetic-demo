package com.learn.ly.sort;

import java.util.*;

/**
 * 排序算法
 */
public class SortArithmetic {

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
     *
     */
    private static void bubbleSort() {
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
                    datas[j+1] = varInt;
                    System.out.print("第" + count + "次排序");
                    System.out.println(Arrays.toString(datas));
                    count++;
                }
            }
        }
        System.out.println(String.format("该算法循环了[%s]次", count));
        //System.out.println(datas);
    }

    /**
     * 选择排序
     */
    public static void selectionSort(){
        System.out.println("选择排序....");
        long start = System.currentTimeMillis();
        int size = datas.length;
        for (int i = 0; i < size; i++) {
            // 设定最小数下标
            int minNum = i;
            //通过一遍排序选出最小数的下标
            for (int j = i; j < size; j++) {
                if(datas[j] < datas[minNum]){
                    minNum = j;
                }
            }

            //进行最小数下标和当前遍历下标数进行交换
            int varInt = datas[i];
            datas[i] = datas[minNum];
            datas[minNum] = varInt;
            System.out.println(Arrays.toString(datas));
        }
        System.out.println(String.format("消耗了[%d]毫秒。", System.currentTimeMillis() - start));
    }


    public static void main(String[] args) {
        // 冒泡排序
        bubbleSort();

        // 选择排序
        selectionSort();
    }
}
