// LeetCode 203 Removing Element by user input...
//Author : Sohel Shaikh
//Date : 7-10-2024.
class ListNode { //ListNode class
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class LeetCode_203 {

    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return dummy.next;
    }
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
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(20);
        head.next.next.next = new ListNode(10);

        LeetCode_203 s = new LeetCode_203();
        ListNode res = s.removeElements(head,20);
        s.display(res);
    }
}
