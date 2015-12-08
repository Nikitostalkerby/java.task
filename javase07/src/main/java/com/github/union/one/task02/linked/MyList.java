package com.github.union.one.task02.linked;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Vaas on 19.11.2015.
 */
public class MyList<E> extends LinkedList<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;

    public MyList() {
    }

    public MyList(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    public E removeLast() {
        final Node<E> l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast(l);
    }

    private E unlinkLast(Node<E> l) {
        final E element = l.item;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null;
        last = prev;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
        size--;
        modCount++;
        return element;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }


}
