package com.ncu.listNode;

public class AddTwoListNode {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode p1 = l1,p2 = l2,cur = new ListNode(0),dump = cur;
        int carry = 0;
        while (p1 != null || p2 != null){
            int v1 = p1!=null?p1.val:0;
            int v2 = p2!=null?p2.val:0;
            cur.next = new ListNode((v1+v2+carry)%10);
            carry = (v1+v2+carry)/10;
            if(p1 != null){
                p1 = p1.next;
            }
            if(p2 != null){
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if(carry != 0){
            cur.next = new ListNode(carry);
        }
        return dump.next;
    }

}
class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
}