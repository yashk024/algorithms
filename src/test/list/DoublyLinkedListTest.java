package test.list;

import datastructures.list.DoublyLinkedList;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList dLL = new DoublyLinkedList();

        dLL.add(20);
        dLL.add(30);
        dLL.add(40);
        dLL.add(50);
        dLL.addFirst(10);
        dLL.addLast(60);
        dLL.add(15, 1);

        System.out.println(dLL);

        System.out.println(dLL.search(12));
        System.out.println(dLL.search(15));

        System.out.println(dLL.remove());
        System.out.println(dLL.remove(1));

        System.out.println(dLL.get(1));

        dLL.set(1, 45);

        System.out.println(dLL);

        dLL.reverse();

        System.out.println(dLL);

        System.out.println(dLL.size());
    }

}
