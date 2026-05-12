package custome_arrayList;

import java.util.Arrays;

// Custom ArrayList Class
class ArrayListCustom<E> {

    // Initial capacity
    private static final int INITIAL_CAPACITY = 10;

    // Current size
    private int size = 0;

    // Internal array
    private Object[] elementData;

    // Constructor
    public ArrayListCustom() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    // Add element
    public void add(E e) {

        // Check capacity
        if (size == elementData.length) {
            ensureCapacity();
        }

        elementData[size++] = e;
    }

    // Get element

    public E get(int index) {

        checkIndex(index);

        return (E) elementData[index];
    }

    // Remove element
    public Object remove(int index) {

        checkIndex(index);

        Object removedElement = elementData[index];

        // Shift elements left
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }

        // Remove last duplicate reference
        elementData[size - 1] = null;

        size--;

        return removedElement;
    }

    // Update element
    public void set(int index, E value) {

        checkIndex(index);

        elementData[index] = value;
    }

    // Contains method
    public boolean contains(E value) {

        for (int i = 0; i < size; i++) {

            if (elementData[i].equals(value)) {
                return true;
            }
        }

        return false;
    }

    // Size method
    public int size() {
        return size;
    }

    // Ensure capacity
    private void ensureCapacity() {

        int newCapacity = elementData.length * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);

        System.out.println("Capacity Increased To : " + newCapacity);
    }

    // Display list
    public void display() {

        System.out.print("Displaying List : ");

        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }

        System.out.println();
    }

    // Index validation
    private void checkIndex(int index) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException(
                    "Index : " + index + ", Size : " + size);
        }
    }
}

// Main Class
public class CustomeArrayList {

    public static void main(String[] args) {

        ArrayListCustom<Integer> list = new ArrayListCustom<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Display
        list.display();

        // Get element
        System.out.println("Element at index 2 : " + list.get(2));

        // Update element
        list.set(1, 200);

        list.display();

        // Remove element
        System.out.println("Removed Element : " + list.remove(3));

        // Display again
        list.display();

        // Contains
        System.out.println("Contains 30 ? " + list.contains(30));

        // Size
        System.out.println("Size : " + list.size());
    }
}