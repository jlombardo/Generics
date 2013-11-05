package generics;

/**
 * A Generic version of an Interface.
 * where "K" represents a key and "V" represents a value. Note this is
 * purely representational -- any letters could be used.
 */
public interface Pair<K, V> {
    public abstract K getKey();
    public abstract V getValue();
}
