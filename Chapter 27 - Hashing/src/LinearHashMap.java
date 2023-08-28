import map.MyMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * **27.1 (Implement MyMap using open addressing with linear probing)

 * Create a new concrete class that implements MyMap using open addressing with linear probing.
 * For simplicity, use f(key) = key % size as the hash function, where size is
 * the hash-table size. Initially, the hash-table size is 4. The table size is doubled
 * whenever the load factor exceeds the threshold (0.5).
 *
 */
public class LinearHashMap<K, V> implements MyMap<K, V> {
    private static int DEFAULT_INITIAL_CAPACITY = 4;
    private static int MAXIMUM_CAPACITY = 1 << 30;
    private int capacity;

    private static float DEFAULT_MAX_LOAD_FACTOR = 0.5f;
    private float loadFactorThreshold;

    private int size = 0;

    Entry<K, V>[] table;

    public LinearHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
    }

    public LinearHashMap(int capacity, float loadFactorThreshold) {
        if(capacity > MAXIMUM_CAPACITY) {
            this.capacity = MAXIMUM_CAPACITY;
        } else {
            this.capacity = trimToPowerOf2(capacity);
        }
        this.loadFactorThreshold = loadFactorThreshold;
        table = new Entry[this.capacity];
    }

    private int trimToPowerOf2(int initialCapacity) {
        int capacity = 1;
        while(capacity < initialCapacity) {
            capacity <<= 1;
        }

        return capacity;
    }

    @Override
    public void clear() {
        size = 0;
        removeEntries();
    }

    public void removeEntries() {
        for(int i = 0; i < capacity; i++) {
            table[i] = null;
        }
    }

    @Override
    public boolean containsKey(K key) {
        if(get(key) != null) {
            return true;
        }

        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for(Entry<K, V> entry: table) {
            if(entry.getValue().equals(value))
                return true;
        }

        return false;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();

        for(Entry<K, V> entry: table) {
            set.add(entry);
        }

        return set;
    }

    @Override
    public V get(K key) {
        int tableIndex = hash(key.hashCode());
        if(table[tableIndex] != null) {
            System.out.println(Arrays.toString(table));
            for(int i = 0; i < capacity; i++){
                if(table[hash(key.hashCode() + i)].getKey().equals(key)) {
                    return table[hash(key.hashCode() + i)].getValue();
                }
            }
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();

        for(int i = 0; i < capacity; i++) {
            if(table[i] != null) {
                set.add(table[i].getKey());
            }
        }

        return set;
    }

    @Override
    public V put(K key, V value) {
        if(size >= capacity * loadFactorThreshold) {
            if(capacity == MAXIMUM_CAPACITY)
                throw new RuntimeException("Exceeding maximum capacity");

            rehash();
        }
        if(get(key) != null){
            for(int i = 0; i < size; i++) {
                if(table[hash(key.hashCode() + i)] == null) {
                    table[hash(key.hashCode() + i)] = new Entry<>(key, value);

                    size++;
                    return value;
                }
            }
        }

        if(size >= capacity * loadFactorThreshold) {
            if(capacity == MAXIMUM_CAPACITY)
                throw new RuntimeException("Exceeding maximum capacity");

            rehash();
        }

        int tableIndex = hash(key.hashCode());
        table[tableIndex] = new Entry<>(key, value);

        size++;
        return value;
    }

    @Override
    public void remove(K key) {
        int tableIndex = hash(key.hashCode());

        for(int i = 0; i < size; i++) {
            if(table[hash(key.hashCode() + i)].getKey() == key) {
                table[hash(key.hashCode() + i)] = null;
                size--;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Set<V> values() {
        Set<V> values = new HashSet<>();

        for(int i = 0; i < size; i++)
            values.add(table[i].getValue());

        return values;
    }

    private int hash(int hashCode) {
        return Math.abs(hashCode % capacity);
    }

    private void rehash() {
        Set<Entry<K, V>> set = entrySet();
        capacity <<= 1;
        table = new Entry[capacity];
        size = 0;

        for(Entry<K, V> entry: set) {
            if(entry != null) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                for (Entry<K, V> entry: table) {
                    builder.append(entry);
                }
            }
        }

        builder.append("]");
        return builder.toString();
    }
}
