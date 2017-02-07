package com.leetcode.medium;

/**
 * Created by Bin Guo on 12/14/16.
 */

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order
 * and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 342 + 465 = 807
 */
public class M2_AddTwoNumbers {
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode temp = l1;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = l2;
        temp.next = new ListNode(6);
        temp = temp.next;
        temp.next = new ListNode(4);

        System.out.println(addTwoNumbers(l1,l2).toString());
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;

        int sum = 0;
        ListNode newListNode = new ListNode(-1);
        ListNode l3 = newListNode;

        while(l1!=null||l2!=null){
            if (l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if (l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            l3.next = new ListNode(sum%10);
            sum/=10;
            l3 = l3.next;
        }
        if(sum==1)
            l3.next = new ListNode(1);
        return newListNode.next;
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
    @Override
    public String toString(){
        return Integer.toString(val);
    }
}
