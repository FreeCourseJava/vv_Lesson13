package com.hyragano;

public class HashDictNode<KEY, VALUE> {
    KEY key;
    VALUE value;

    HashDictNode<KEY, VALUE> next;

    public HashDictNode(KEY key, VALUE value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\t\t<" + this.key + "> : " + this.value + "\n";
    }
}
