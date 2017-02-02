package LinkedListVector;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListVector<E> extends LinkedList{
    private LinkedList<E> linkedListVector;
    private E nextVector;
    private E prevVector;
    private E firstElement;
    private E lastElement;


    public LinkedListVector(LinkedList<E> linkedListVector, E nextVector, E prevVector, E firstElement, E lastElement) {
        this.linkedListVector = linkedListVector;
        this.nextVector = nextVector;
        this.prevVector = prevVector;
        this.firstElement = linkedListVector.getFirst();
        this.lastElement = linkedListVector.getLast();
    }

    public LinkedListVector(Collection c, LinkedList<E> linkedListVector, E nextVector, E prevVector, E firstElement, E lastElement) {
        super(c);
        this.linkedListVector = linkedListVector;
        this.nextVector = nextVector;
        this.prevVector = prevVector;
        this.firstElement = linkedListVector.getFirst();
        this.lastElement = linkedListVector.getLast();
    }

    public LinkedListVector() {
        this.linkedListVector = new LinkedList<E>();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LinkedListVector<?> that = (LinkedListVector<?>) o;

        if (!linkedListVector.equals(that.linkedListVector)) return false;
        if (!nextVector.equals(that.nextVector)) return false;
        if (!prevVector.equals(that.prevVector)) return false;
        if (!firstElement.equals(that.firstElement)) return false;
        return lastElement.equals(that.lastElement);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + linkedListVector.hashCode();
        result = 31 * result + nextVector.hashCode();
        result = 31 * result + prevVector.hashCode();
        result = 31 * result + firstElement.hashCode();
        result = 31 * result + lastElement.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LinkedListVector{" +
                "linkedListVector=" + linkedListVector +
                ", nextVector=" + nextVector +
                ", prevVector=" + prevVector +
                ", firstElement=" + firstElement +
                ", lastElement=" + lastElement +
                '}';
    }

    @Override
    public  Object clone() {
        return super.clone();
    }

//    public static ArrayVector unmodifiableArrayVector(Collection c){
//
//        return new LinkedListVector(c){
//            @Override
//            public synchronized boolean add(Object o) {
//                throw new UnsupportedOperationException();
//            }
//
//            @Override
//            public synchronized boolean addAll(Collection c) {
//                throw new UnsupportedOperationException();
//            }
//
//            @Override
//            public synchronized boolean removeAll(Collection c) {
//                throw new UnsupportedOperationException();
//            }
//        };
//    }
}
