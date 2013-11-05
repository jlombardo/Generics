package generics;

/**
 * An implementation of the Pair Interface using Generics.
 * Note that "K" represents a key and "V" represents a value, just as in
 * the interface definition. We could use any letters we want. It's position
 * sensitive only.
 */
public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}