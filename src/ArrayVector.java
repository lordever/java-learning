import java.util.*;

public class ArrayVector implements List {

    List arrayVector;

    @Override
    public String toString() {
        return "ArrayVector{" +
                "arrayVector=" + arrayVector +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayVector that = (ArrayVector) o;

        return arrayVector.equals(that.arrayVector);

    }

    @Override
    public int hashCode() {
        return arrayVector.hashCode();
    }

    public ArrayVector() {
        this.arrayVector = new Vector();
    }

    @Override
    public int size() {
        return this.arrayVector.size();
    }

    @Override
    public boolean isEmpty() {
        if(this.arrayVector != null && this.arrayVector.size() != 0){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return this.arrayVector.iterator();
    }

    @Override
    public Object[] toArray() {
        int size = this.arrayVector.size();
        return new Object[size];
    }

    @Override
    public boolean add(Object o) {
        this.arrayVector.add(o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        this.arrayVector.remove(o);
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        this.arrayVector.addAll(c);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        this.arrayVector.addAll(index, c);
        return true;
    }

    @Override
    public void clear() {
        this.arrayVector.clear();
    }

    @Override
    public Object get(int index) {
        return this.arrayVector.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return this.arrayVector.set(index, element);
    }

    @Override
    public void add(int index, Object element) {
        this.arrayVector.add(index, element);
    }

    @Override
    public Object remove(int index) {
        return this.arrayVector.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return this.arrayVector.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.arrayVector.lastIndexOf(o);
    }

    @Override
    public ListIterator listIterator() {
        return this.arrayVector.listIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return this.arrayVector.listIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return this.arrayVector.subList(fromIndex, toIndex);
    }

    @Override
    public boolean retainAll(Collection c) {
        return this.arrayVector.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return this.arrayVector.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return this.arrayVector.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new ArrayVector().toArray(a);
    }
}
