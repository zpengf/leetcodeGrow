/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 */



public class TwoNumAdd {
    public static void main (String args[]){
        ListNode l1 = new ListNode();
        ListNode l11 = new ListNode();
        l1.val = 9;l11.val = 9;
        l1.next = l11;

        ListNode l2 = new ListNode();
        ListNode l21 = new ListNode();
        ListNode l22 = new ListNode();
        l2.val = 9;l21.val = 9;l22.val = 9;
        l2.next = l21;l21.next = l22;

        ListNode re = addTwoNumbers1(l1,l2);

        while (re != null){
            System.out.println(re.val);
            re = re.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode();
        resultListNode.next = new ListNode();
        if(l1 == null || l2 == null){
            return resultListNode;
        }
        if(l1.val + l2.val == 10){
            resultListNode.val = 0;
            resultListNode.next.val += 1;
        }
        if(l1.val + l2.val > 10){
            resultListNode.val = 1;
            int num = l1.val + l2.val - 10;
            resultListNode.next.val += num;
        }
        resultListNode.val = l1.val + l2.val;

        return addTwoNumbers(l1.next,l2.next);
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode nextListNode = new ListNode();
        ListNode cur = nextListNode;
        int a = 0;
        while (l1 != null || l2 != null){
            ListNode sumNode = new ListNode();
            int sumVal = 0;
            if(l1 == null){
                sumVal = 0 + l2.val + a;
            }
            if(l2 == null){
                sumVal = l1.val + 0 + a;
            }
            if(l2 != null && l1 != null){
                sumVal = l1.val + l2.val + a;
            }
            if(sumVal < 10){
                sumNode.val = sumVal;
            }
            if(sumVal == 10){
                sumNode.val = 0;
                a = 1;
            }
            if(sumVal > 10){
                a = sumVal / 10;
                sumNode.val = sumVal - a * 10;
            }

            cur.next = sumNode;
            cur = sumNode;


            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }


        return nextListNode.next;
    }


}
