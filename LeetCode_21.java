import java.util.*;

class ListNode{
    public List<Integer> val;
    public ListNode(){
        val = new ArrayList<>();
    }
    public void addTo(int n){
        val.add(n);
    }
    public void display(){
        System.out.println(val);
    }
}

public class LeetCode_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> n1 = new ArrayList<>();
        ListNode last = new ListNode();
        for(int i=0;i<list1.val.size();i++){
            n1.add(list1.val.get(i));
        }
        for(int i=0;i<list2.val.size();i++){
            n1.add(list2.val.get(i));
        }

        Collections.sort(n1);
        last.val = n1;
        return last;

    }

    public static void main(String[] args){
        ListNode l1 = new ListNode();
        l1.addTo(1);
        l1.addTo(2);
        l1.addTo(4);

        ListNode l2 = new ListNode();
        l2.addTo(1);
        l2.addTo(3);
        l2.addTo(4);

        LeetCode_21 lc = new LeetCode_21();
        ListNode res = lc.mergeTwoLists(l1, l2);
        res.display();

    }
}
