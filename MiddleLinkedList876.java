import java.util.ArrayList;

public class MiddleLinkedList876 {
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node5 = new ListNode(8);
        ListNode node4 = new ListNode(node5, 7);
        ListNode node3 = new ListNode(node4, 4);
        ListNode node2 = new ListNode(node3, 1);
        ListNode head = new ListNode(node2, 1);

        // Find the middle node
        ListNode middle = middleNode(head);

        // Print the value of the middle node
        System.out.println("The middle node value is: " + middle.val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();

        int length = 0;
        while (head != null) {
            array.add(head);
            head = head.next;
            length++;
        }
        return array.get(length / 2);
    }
}
