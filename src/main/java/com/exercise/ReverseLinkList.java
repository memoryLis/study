package com.exercise;

/**
 * ClassName: ReverseLinkList
 * Package: com.guang.exercise
 * Description:
 *
 * @Author liang
 * @Create 2025/5/22 14:59
 * leetcode 206
 */
public class ReverseLinkList {

  //你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 /**
  * Definition for singly-linked list.
  * public class ListNode {
  *     int val;
  *     ListNode next;
  *     ListNode() {}
  *     ListNode(int val) { this.val = val; }
  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  * }
  */

    /**
     * 普通解法
     * @param head
     * @return
     */
    public  static  ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode currentNode = head;
        ListNode temp =null;
        while(currentNode != null ){
            temp=currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode =temp;
        }
        return  preNode;

 }

  public static class ListNode {
       int val;
       ListNode next;
       ListNode() {
       }
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }


    /**
     * 递归解法
     * @param
     */
    public static  ListNode reverse(ListNode pre,ListNode current){
        if(current == null ){
            return  pre;
        }
        ListNode temp ;
        temp = current.next;
        current.next = pre;
        reverse(current,temp);
        return null;

    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        ListNode n3 = new ListNode();
        n1.next=n2;
        n2.next=n3;
        ListNode pre = null;
        reverse(null,n1);





    }



}
