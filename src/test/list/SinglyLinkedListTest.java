package test.list;

import datastructures.list.SinglyLinkedList;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.add(20);
        sLL.add(30);
        sLL.add(40);
        sLL.add(50);
        sLL.addFirst(10);
        sLL.addLast(60);
        sLL.add(15, 1);

        System.out.println(sLL);

        System.out.println(sLL.search(12));
        System.out.println(sLL.search(15));

        System.out.println(sLL.remove());
        System.out.println(sLL.remove(1));

        System.out.println(sLL.get(1));

        sLL.set(1, 45);

        System.out.println(sLL);

        sLL.reverse();

        System.out.println(sLL);

        System.out.println(sLL.size());
    }

}
