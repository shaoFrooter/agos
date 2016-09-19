package lecode.AddTwoNumbers;

/**
 * Created by sfeng on 2016/9/18.
 */

/*You are given two linked lists representing two non-negative numbers.
The digits are stored in reverse order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.

        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8*/

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head=new ListNode(-1);
//        ListNode cur=head;
//        ListNode l1hd=l1;
//        ListNode l2hd=l2;
//        int flag=0;
//        int res=0;
//        while(l1hd!=null&&l2hd!=null){
//            res=(l1hd.val+l2hd.val+flag)%10;
//            flag=(l1hd.val+l2hd.val)/10;
//            ListNode l=new ListNode(res);
//            l.next=null;
//            cur.next=l;
//            cur=l;
//            l1hd=l1hd.next;
//            l2hd=l2hd.next;
//        }
//
//        while(l1hd!=null){
//            res=(l1hd.val+flag)%10;
//            flag=(l1hd.val+flag)/10;
//            ListNode l=new ListNode(res);
//            cur.next=l;
//            cur=l;
//            l1hd=l1hd.next;
//        }
//
//        while(l2hd!=null){
//            res=(l2hd.val+flag)%10;
//            flag=(l2hd.val+flag)/10;
//            ListNode l=new ListNode(res);
//            cur.next=l;
//            cur=l;
//            l2hd=l2hd.next;
//        }
//        if(flag==1){
//            cur.next=new ListNode(flag);
//        }
//
//        return head.next;
//
//    }
}
