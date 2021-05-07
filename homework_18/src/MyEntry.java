public class MyEntry<K, V> {

    //оголошую поля класу
    private K keyMap;
    private V valueMap;

    //створюю конструктор класу
    public MyEntry(K keyMap, V valueMap) {
        this.keyMap = keyMap;
        this.valueMap = valueMap;
    }

    //створюємо методи Getter та Setter
    public K getKeyMap() {
        return keyMap;
    }

    public void setKeyMap(K keyMap) {
        this.keyMap = keyMap;
    }

    public V getValueMap() {
        return valueMap;
    }

    public void setValueMap(V valueMap) {
        this.valueMap = valueMap;
    }
}
