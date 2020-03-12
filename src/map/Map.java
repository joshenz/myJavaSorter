package map;

/**
 * TODO.
 *
 * @author ZHENG
 * @version 1.0
 * @date 2020/3/9 17:07
 */
public interface Map<K,V> {

    public V put(K key, V value);

    public V get(K key);

    public boolean containsKey(K key);

    public  boolean containValue(V value);

    public boolean isEmpty();

    public  int size();

    public void clear();
