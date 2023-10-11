public class SimplePair<K, V> implements MyPair {
    private K key;
    private V value;

    //t-type, e- element , k key  ,v value s u v

    public SimplePair(K key, V value){
        this.key=key;
        this.value = value;
    }

    @Override
    public K getKey(){
        return this.key;
    }
    @Override
    public V getValue(){
        return this.value;
    }
}
