package ArrayVector;

import java.util.*;

public class ArrayVector<E> extends Vector<E>{

    private Vector<E> arrayVector;
    private E firstVector;
    private E lastVector;


    public ArrayVector() {
        this.arrayVector = new Vector<E>();
    }

    public ArrayVector(Collection<E> c){
        this.arrayVector = new Vector<E>();
        this.arrayVector.addAll(c);
        this.firstVector = this.arrayVector.firstElement();
        this.lastVector = this.arrayVector.lastElement();
    }

    public ArrayVector(int capacity){
        this.arrayVector = new Vector<E>(capacity);
    }

    public ArrayVector(int capacity, int capacityIncrement){
        this.arrayVector = new Vector<E>(capacity, capacityIncrement);
    }

    @Override
    public String toString() {
        return "ArrayVector.ArrayVector{" +
                "arrayVector=" + arrayVector +
                ", firstVector=" + firstVector +
                ", lastVector=" + lastVector +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ArrayVector<?> that = (ArrayVector<?>) o;

        if (!firstVector.equals(that.firstVector)) return false;
        return lastVector.equals(that.lastVector);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + firstVector.hashCode();
        result = 31 * result + lastVector.hashCode();
        return result;
    }

    @Override
    public synchronized boolean add(E e) {
        boolean isAdd = arrayVector.add(e);
        this.firstVector = arrayVector.firstElement();
        this.lastVector = arrayVector.lastElement();
        return isAdd;
    }

    @Override
    public  Object clone() {
        return super.clone();
    }

    public static ArrayVector unmodifiableArrayVector(Collection c){

        return new ArrayVector(c){
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
