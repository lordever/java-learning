package LinkedListVector;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListVector<E> extends Vector<E>{
    private LinkedList<E> linkedListVector;
    private E firstElement;
    private E lastElement;

    public boolean add(E e) {
        boolean isAdd = linkedListVector.add(e);
        this.firstElement = linkedListVector.getFirst();
        this.lastElement = linkedListVector.getLast();
        return isAdd;
    }

    public LinkedListVector(LinkedList<E> linkedListVector, E firstElement, E lastElement) {
        this.linkedListVector = linkedListVector;
        this.firstElement = linkedListVector.getFirst();
        this.lastElement = linkedListVector.getLast();
    }

    public LinkedListVector(Collection c, LinkedList<E> linkedListVector, E nextVector, E prevVector) {
        this.linkedListVector = linkedListVector;
        this.firstElement = linkedListVector.getFirst();
        this.lastElement = linkedListVector.getLast();
    }

    public LinkedListVector(Collection c){
        this.linkedListVector = new LinkedList<E>();
        this.linkedListVector.addAll(c);
        this.firstElement = this.linkedListVector.getFirst();
        this.lastElement = this.linkedListVector.getLast();
    }

    public LinkedListVector() {
        this.linkedListVector = new LinkedList<E>();
    }

    @Override
    public int size() {
        return linkedListVector.size();
    }

    @Override
    public E get(int index) {
        return linkedListVector.get(index);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LinkedListVector<?> that = (LinkedListVector<?>) o;

        if (!linkedListVector.equals(that.linkedListVector)) return false;
        if (!firstElement.equals(that.firstElement)) return false;
        return lastElement.equals(that.lastElement);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + linkedListVector.hashCode();
        result = 31 * result + firstElement.hashCode();
        result = 31 * result + lastElement.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LinkedListVector{" +
                "linkedListVector=" + linkedListVector +
                ", firstElement=" + firstElement +
                ", lastElement=" + lastElement +
                '}';
    }

    @Override
    public  Object clone() {
        return super.clone();
    }

    public static LinkedListVector unmodifiableArrayVector(Collection c){
        return new LinkedListVector(c) {
            @Override
            public synchronized boolean add(Object o) {
                throw new UnsupportedOperationException();
            }

            @Override
            public synchronized boolean addAll(Collection c) {
                throw new UnsupportedOperationException();
            }

            @Override
            public synchronized boolean removeAll(Collection c) {
                throw new UnsupportedOperationException();
            }
        };
    }
}
