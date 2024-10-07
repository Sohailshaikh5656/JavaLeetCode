//LeetCode 206 Reverse List
//author : Sohel
//Date 7/10/2024

import java.util.*;
class ListNode {
     int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class LeetCode_206 {
    public void display(ListNode head){
        ListNode current = head;
        while(current!=null){
            if(current.next!=null){
                System.out.print(current.val+" -> ");
            }
            else{
                System.out.print(current.val);
            }
            current = current.next;
        }
    }
    public ListNode reverseList(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        ListNode rev = dummy;
        List<Integer> l1 = new ArrayList<>();
        while(current!=null){
            l1.add(current.val);
            current = current.next;
        }
        Collections.reverse(l1);
        for(int i=0;i<l1.size();i++){
            rev.next = new ListNode(l1.get(i));
            rev = rev.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
       ListNode head = new ListNode(10);
       head.next = new ListNode(20);
       head.next.next = new ListNode(30);
       head.next.next.next = new ListNode(40);

       LeetCode_206 s = new LeetCode_206();
       ListNode rev = s.reverseList(head);
       System.out.print("Orignal List : ");
       s.display(head);
       System.out.println("");
       System.out.print("Rev List : ");
       s.display(rev);
    }    
}
