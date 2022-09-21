package com.hyragano;

public class Node<KEY, VALUE> {
    KEY key;
    VALUE value;

    public Node(KEY key, VALUE value) {
        this.key = key;
        this.value = value;
    }
}
