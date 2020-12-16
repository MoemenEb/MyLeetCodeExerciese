public class addTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode sum = new ListNode(0);
      ListNode A = l1 , B=l2 , SUM = sum;
      int carry = 0;
      while (A != null || B != null){
        int x = (A != null)? A.val : 0;
        int y = (B != null)? B.val : 0;
        int addXY = x + y + carry;
        carry = addXY / 10;
        SUM.next = new ListNode(addXY % 10);
        SUM = SUM.next;
        if (A != null) A=A.next;
        if (B != null) B=B.next;
      }
      if(carry > 1){
          SUM.next = new ListNode(carry);
      }

      return sum.next;
  }
}



class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
