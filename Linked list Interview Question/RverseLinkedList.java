public class RverseLinkedList {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node head) {
        if(head == null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }

    // Recursive: TC = O(n), SC = O(n)
    public static Node reverse(Node head) {
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Iterative: TC = O(n), SC = O(1)
    public static Node reverse2(Node head) {
        Node curr = head, prev = null, after = null;
        while(curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        display(a);
        a = reverse2(a);
        System.out.println();
        display(a);

    }
}
