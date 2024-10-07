import java.util.*;

import org.w3c.dom.NodeList;
//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LeetCode_83 {
    public static List<Integer> remDup(ListNode head){
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        list.add(current.val);
        boolean flag;
        while(current!null){
            for(int i=0;i<list.size();i++){
                if(current.val ==list.get(i)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                list.add(current.val);
            }
            flag=false;
            current = current.next;
        }
        return list;
    }
    public ListNode deleteDuplicates(ListNode head){
        List<Integer> list = remDup(head);
        ListNode n = new ListNode(list.get(0));
        ListNode current = n;
        for(int i=1;i<list.size();i++){
            current.val = list.get(i);
            current = current.next;
        }
        return n;

    }
     public static void main(String[] args){
        ListNode n = new ListNode(10);
        n.next = new ListNode(20);
        n.next.next = new ListNode(30);
        n.next.next.next = new ListNode(30);

        LeetCode_83 s = new LeetCode_83();
        s.deleteDuplicates(n);

     }
}