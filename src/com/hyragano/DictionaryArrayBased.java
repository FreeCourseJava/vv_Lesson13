package com.hyragano;

public class DictionaryArrayBased<KEY, VALUE> implements Dictionary<KEY, VALUE> {
    private Node<KEY, VALUE>[] keyValues =  new Node[0];


    @Override
    public void put(KEY key, VALUE value) {
        Node<KEY, VALUE> newNode = new Node<>(key, value);

        var index = getIndex(key);
        if (index  == -1) {
            keyValues =  createNewArray();
            keyValues[keyValues.length-1] = newNode;
        } else {
            keyValues[index] = newNode;
        }

    }

    private Node<KEY, VALUE>[] createNewArray() {
        Node<KEY, VALUE>[] newArray = new Node[keyValues.length+1];
        System.arraycopy(keyValues, 0, newArray, 0, keyValues.length);

        return newArray;
    }

    @Override
    public VALUE get(KEY key) {
        var index = getIndex(key);
        if (index > -1) {
            return keyValues[index].value;
        }
        return null;
    }

    private int getIndex(KEY key) {
        for (int index = 0; index < keyValues.length ; index++) {
            Node<KEY, VALUE> currentKeyValue = keyValues[index];
            if (key.equals(currentKeyValue.key)) {
                return index;
            }
        }
        return -1;
    }
}
