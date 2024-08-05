import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class MyHashSet<T>  implements Iterable<T>{
    private HashMap<Integer, T> myHashMap = new HashMap<>();
    public int key = 0;

    public void put(T element) {
        if(!myHashMap.containsValue(element)) {
            myHashMap.put(key, element);
            key++;
        }
    }

    public boolean contains(T element) {
        return myHashMap.containsValue(element);
    }

    public void delete(T element) {
        for (Map.Entry<Integer, T> entry : myHashMap.entrySet()) {
            if (entry.getValue().equals(element)) {
                myHashMap.remove(entry.getKey());
                key--;
                return;
            }
        }
        throw new NoSuchElementException("No such element in the set!");
    }

    @Override
    public Iterator<T> iterator() {
        return new MyHashSetIterator();
    }

    private class MyHashSetIterator implements Iterator<T> {
        private Iterator<Map.Entry<Integer, T>> iterator = myHashMap.entrySet().iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public T next() {
            return iterator.next().getValue();
        }
    }
}
