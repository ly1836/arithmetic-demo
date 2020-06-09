package com.learn.ly.arithmetic;

import java.util.Scanner;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LinkTableNumAdd {


    private static class ListNode {
        // 链表当前节点值
        private int val;

        // 链表下个节点值
        private ListNode nextNode;

        private ListNode() {
        }

        private ListNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private static void printLinkTable(ListNode node) {
        System.out.println(node.getVal());
        if (node.nextNode != null) {
            printLinkTable(node.nextNode);
        }
    }

    private static ListNode writeNode() {
        Scanner sc = new Scanner(System.in);

        //链表根节点
        ListNode rootNode = null;
        //链表指针
        ListNode poin = null;
        //while (true){
        for (int i = 0; i < 3; i++) {
            int val = sc.nextInt();
            /*if (val == -1) {
                System.out.println("------------------");
                break;
            }*/
            //第一次进入循环时,新建根节点和指针元素
            if (rootNode == null) {
                poin = new ListNode(val);
                //将指针的引用赋值给根节点
                rootNode = poin;
            } else {
                //第N次进入循环,新建新节点
                ListNode newNode = new ListNode(val);
                //新节点引用赋值给指针，此时指针引用指向的是上个节点,所以就是真实的节点的nextNode指向了新节点
                poin.nextNode = newNode;
                //指针引用移到新节点
                poin = newNode;
            }
        }

        System.out.println("------------------");
        return rootNode;
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode mergerNode = null;
        int moveUp = 0;
        ListNode constNode = null;
        while (l1 != null || l2 != null) {
            int l1Value = l1 == null ? 0 : l1.val;
            int l2Value = l2 == null ? 0 : l2.val;
            int value = l1Value + l2Value + moveUp;
            if (value >= 10) {
                value -= 10;
                moveUp = 1;
            } else {
                moveUp = 0;
            }

            if(constNode == null){
                constNode = new ListNode(value);
                mergerNode = constNode;
            }else{
                ListNode newNode = new ListNode(value);
                constNode.nextNode = newNode;
                constNode = newNode;
            }


            if (l1 != null)
                l1 = l1.nextNode;
            if (l2 != null)
                l2 = l2.nextNode;

            //如果两个链表都为空，而且上一个节点相加和>10进一位的话，新建一个节点
            if(l1 == null && l2 == null && moveUp == 1){
                ListNode newNode = new ListNode(1);
                constNode.nextNode = newNode;
                constNode = newNode;
            }
        }
        return mergerNode;
    }

    private ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.nextNode = sumNode;
            cursor = sumNode;

            if(l1 != null) l1 = l1.nextNode;
            if(l2 != null) l2 = l2.nextNode;
        }

        return root.nextNode;
    }

    public static void main(String[] args) {
        ListNode num1RootNode = writeNode();
        ListNode num2RootNode = writeNode();

        LinkTableNumAdd add = new LinkTableNumAdd();
        ListNode mergerNode = add.addTwoNumbers(num1RootNode, num2RootNode);
        //ListNode mergerNode = add.addTwoNumbers1(num1RootNode, num2RootNode);
        printLinkTable(mergerNode);
    }

}
