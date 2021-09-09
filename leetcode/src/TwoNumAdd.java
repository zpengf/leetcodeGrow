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
        ListNode l12 = new ListNode();
        l1.val = 2;
        l11.val = 4;
        l12.val = 3;
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode();
        ListNode l21 = new ListNode();
        ListNode l22 = new ListNode();
        ListNode l23 = new ListNode();
        l2.val = 5;
        l21.val = 6;
        l22.val = 4;
//        l23.val = 9;
        l2.next = l21;
        l21.next = l22;
//        l22.next = l23;

        ListNode re = addTwoNumbers1(l1,l2);

        while (re != null){
            System.out.println(re.val);
            re = re.next;
        }

    }



    /**
     * 执行用时：
     * 2 ms
     * , 在所有 Java 提交中击败了
     * 96.92%
     * 的用户
     * 内存消耗：
     * 38.8 MB
     * , 在所有 Java 提交中击败了
     * 20.56%
     * 的用户
     * 通过测试用例：
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return root.next;
    }

    /**
     * 执行用时：
     * 2 ms
     * , 在所有 Java 提交中击败了
     * 96.92%
     * 的用户
     * 内存消耗：
     * 37.9 MB
     * , 在所有 Java 提交中击败了
     * 99.88%
     * 的用户
     * 通过测试用例：
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode nextListNode = new ListNode();
        ListNode cur = nextListNode;
        int a = 0;
        while (l1 != null || l2 != null || a != 0){
            ListNode sumNode = new ListNode();
            int sumVal = 0;
            if(l1 == null && l2 != null){
                sumVal = 0 + l2.val + a;
            }else if(l2 == null && l1 != null){
                sumVal = l1.val + 0 + a;
            }else if(l2 == null && l1 == null){
                sumVal = a;
                a = 0;
            }else if(l2 != null && l1 != null){
                sumVal = l1.val + l2.val + a;
            }

            if(sumVal < 10){
                sumNode.val = sumVal;
                a = 0;
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
