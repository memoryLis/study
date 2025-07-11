package com.exercise.deleteDuplicates;

/**
 * ClassName: DeleteDuplicates
 * Package: com.guang.exercise.deleteDuplicates
 * Description:
 *
 * @Author liang
 * @Create 2025/5/24 21:14
 * @Version jdk17.0
 */
public class DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode currentNode = head;
        ListNode nextNode = currentNode.next;
        ListNode temp;
        while (nextNode != null) {
            if (nextNode.val == currentNode.val) {
                // 下一个节点与本节点相同，删除下一个节点
                temp = nextNode.next;
                currentNode.next = temp;
                nextNode=currentNode.next;
            } else {
                // 不相同
                temp = nextNode.next;
                currentNode = nextNode;
                nextNode = temp;
            }


        }
        return head;
    }

 public static void main(String[] args) {
  ListNode head = new ListNode(1);
   head.next = new ListNode(2);
   head.next.next = new ListNode(2);
   head.next.next.next = new ListNode(3);
  ListNode head1 = deleteDuplicates(head);

 }
}
