package com.hyragano;

public class DictionaryHashTable<KEY, VALUE> implements Dictionary<KEY, VALUE> {

    private final int bucketsCount;
    private final HashDictNode<KEY, VALUE>[] buckets;

    public DictionaryHashTable(int bucketsCount) {
        this.bucketsCount = (bucketsCount > 0) ? bucketsCount : 256;
        buckets = new HashDictNode[this.bucketsCount];
    }

    public DictionaryHashTable() {
        this(0);
    }


    @Override
    public void put(KEY key, VALUE value) {
        int index = this.getIndex(key.hashCode());
        HashDictNode<KEY, VALUE> newNode = new HashDictNode<>(key, value);
        HashDictNode<KEY, VALUE> currentNode = this.buckets[index];
        HashDictNode<KEY, VALUE> prevNode ;

        if (currentNode == null) {
            this.buckets[index] = newNode;
        } else if (newNode.key.equals(currentNode.key)) {
            newNode.next = currentNode.next;
            this.buckets[index] = newNode;
        } else {
            do {
                prevNode = currentNode;
                currentNode = prevNode.next;

                if (currentNode == null) {
                    prevNode.next = newNode;
                    return;

                } else if (currentNode.key.equals(newNode.key)) {
                    newNode.next = currentNode.next;
                    prevNode.next = newNode;
                    return;

                }

            } while (true);

        }
    }


    @Override
    public VALUE get(KEY key) {
        int index = this.getIndex(key.hashCode());
        HashDictNode<KEY, VALUE> node = buckets[index];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            } else {
                node = node.next;
            }
        }

        return null;
    }

    private int getIndex(int hash) {
        return (this.bucketsCount - 1) & hash;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.bucketsCount; i++) {
            res += "Bucket " + i + "[\n";
            HashDictNode<KEY, VALUE> node = buckets[i];
            while (node != null) {
                res += node;
                node = node.next;
            }
            res += "]\n";
        }

        return res;
    }
}
