package com.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Circularlinkedlist
 * Package: com.guang.exercise
 * Description:
 *
 * @Author liang
 * @Create 2025/5/28 21:41
 * @Version jdk17.0
 *  LeetCode 141. Linked List Cycle（简单） - 检测链表中的循环
 */
public class Circularlinkedlist {
    //暴力，性能不行

    public static boolean hasCycle(ListNode head) {//暴力解法
        //1 获取链表中最后一个节点
        ListNode current = head;
        List<ListNode> listNodes = new ArrayList<ListNode>();
        if(head == null){
            return false;
        }
        ListNode next = head.next;
        if(next == null){
            return false;
        }
        //获取到链表最后一个节点
        while(next!=null){
            listNodes.add(current);
            //进行判断，判断这个next与其前面的有没有相等的
            if(listNodes.contains(next)){
                return true;
            }
            current = next;
            next = current.next;
        }
        return false;


        /**
         * 利用快慢指针，一个快指针每次走2个节点，一个慢指针每次走一个位置
         */


    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        boolean b = hasCycle(head);
    }
}
