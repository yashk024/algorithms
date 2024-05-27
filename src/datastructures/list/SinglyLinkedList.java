package datastructures.list;

public class SinglyLinkedList {

    private class Node {
        private int val;
        private Node next;

        private Node(int val) {
            this.val = val;
        }

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void add(int val) {
        addLast(val);
    }

    public void add(int val, int idx) {
        if (idx > size || idx < 0) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        if (idx == 0) {
            addFirst(val);
        } else if (idx == size) {
            addLast(val);
        } else {
            Node n = head;
            while (--idx > 0) {
                n = n.next;
            }
            n.next = new Node(val, n.next);
            size++;
        }
    }

    public void addFirst(int val) {
        if (head == null) {
            head = tail = new Node(val);
        } else {
            head = new Node(val, head);
        }
        size++;
    }

    public void addLast(int val) {
        if (head == null) {
            head = tail = new Node(val);
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
        size++;
    }

    public int search(int val) {
        int idx = 0;
        Node n = head;
        while (n != null) {
            if (n.val == val) {
                return idx;
            }
            n = n.next;
            idx++;
        }
        return -1;
    }

    public int remove() {
        return removeLast();
    }

    public int remove(int idx) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        if (idx == 0) {
            return removeFirst();
        }
        if (idx == size - 1) {
            return removeLast();
        }
        Node n = head;
        while (--idx > 0) {
            n = n.next;
        }
        int rm = n.next.val;
        n.next = n.next.next;
        size--;
        return rm;
    }

    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("cannot remove item from an empty list");
        }
        int rm = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return rm;
    }

    public int removeLast() {
        if (head == null) {
            throw new RuntimeException("cannot remove item from an empty list");
        }
        int rm = tail.val;
        if (head.next == null) {
            head = tail = null;
        } else {
            Node n = head;
            while (n.next != tail) {
                n = n.next;
            }
            n.next = null;
            tail = n;
        }
        size--;
        return rm;
    }

    public int get(int idx) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        Node n = head;
        while (idx-- > 0) {
            n = n.next;
        }
        return n.val;
    }

    public void set(int idx, int val) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        Node n = head;
        while (idx-- > 0) {
            n = n.next;
        }
        n.val = val;
    }

    public void reverse() {
        tail = head;
        Node prev = null;
        Node n = head;
        while (n != null) {
            head = n;
            n = n.next;
            head.next = prev;
            prev = head;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node n = head;
        while (n != null) {
            sb.append(n.val);
            n = n.next;
            if (n != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
