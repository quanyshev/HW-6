class MyArrayList<T> {
    private T[] myArrayList = (T[]) new Object[10];
    private int size = 0;

    public void put(T element) {
        myArrayList[size] = element;
        size++;
        if (size == myArrayList.length) {
            T[] newMyArrayList = (T[]) new Object[myArrayList.length * 2];
            for (int i = 0; i < myArrayList.length; i++) {
                newMyArrayList[i] = myArrayList[i];
            }
            myArrayList = newMyArrayList;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return myArrayList[index];
    }

    public void delete(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                myArrayList[i] = myArrayList[i + 1];
            }
            size--;
        }
    }
}
