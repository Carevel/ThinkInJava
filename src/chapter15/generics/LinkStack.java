package chapter15.generics;

/**
 * Created by Changjiang on 2016/11/16.
 */
public class LinkStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

    }
    private Node<T> top=new Node<T>();
}
