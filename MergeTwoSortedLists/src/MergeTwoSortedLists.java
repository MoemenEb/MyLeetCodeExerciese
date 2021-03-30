//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode l3=new ListNode(0);
        ListNode l=l3;

        while(l1!=null && l2!=null){
            if (l1.val >= l2.val) {
                l3.next = l2;
                l2 = l2.next;
            } else {
                l3.next = l1;
                l1 = l1.next;
            }
            l3=l3.next;
        }

        if(l1 != null){
            l3.next = l1;
        }
        if(l2 != null){
            l3.next = l2;
        }
        return l.next;
    }



//    public static void main (String [] ar){
//        MergeTwoSortedLists m = new MergeTwoSortedLists();
//
//        ListNode la = new ListNode(1);
//        la.next = new ListNode(2);
//        ListNode lb = new ListNode(1);
//        lb.next = new ListNode(3);
//        System.out.println(m.mergeTwoLists(la,lb));
//
//
//    }
}

