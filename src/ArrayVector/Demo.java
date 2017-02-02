package ArrayVector;

import java.util.Vector;

public class Demo extends Vector {
    private ArrayVector<String> arrayVectorString = new ArrayVector();
    private ArrayVector<Integer> arrayVectorNumber = new ArrayVector();
    private ArrayVector<Integer> arrayVectorInteger = new ArrayVector();

    public void start() {
        initVariables();
        quest1();
        quest2();
        quest3();
        quest4();
        quest5();
    }

    private void quest1() {
        System.out.println("Quest 1:");
        System.out.println(arrayVectorString.toString());
    }

    private void quest2() {
        System.out.println("\nQuest 2:");
        if (arrayVectorString.equals(arrayVectorNumber))
            System.out.println("arrayVectorString = arrayVectorNumber"); //false
        else
            System.out.println("arrayVectorString != arrayVectorNumber"); //true

        if (arrayVectorInteger.equals(arrayVectorNumber))
            System.out.println("arrayVectorInteger = arrayVectorNumber"); //true
        else
            System.out.println("arrayVectorInteger != arrayVectorNumber"); //false
    }

    private void quest3() {
        System.out.println("\nQuest 3:");
        if (arrayVectorString.hashCode() == arrayVectorNumber.hashCode())
            System.out.println("arrayVectorString = arrayVectorNumber"); //false
        else
            System.out.println("arrayVectorString != arrayVectorNumber"); //true
        if (arrayVectorNumber.hashCode() == arrayVectorInteger.hashCode())
            System.out.println("arrayVectorInteger = arrayVectorNumber"); //true
        else
            System.out.println("arrayVectorInteger != arrayVectorNumber"); //false
    }

    private void quest4(){
        System.out.println("\nQuest 4:");
        ArrayVector<Integer> cloneVectorInteger = (ArrayVector<Integer>) arrayVectorInteger.clone();
        System.out.println(cloneVectorInteger.toString());
    }

    private void quest5() {
        System.out.println("\nQuest 5:");
        Vector<String> names = new Vector<String>();
        names.add("Marta");
        names.add("Derek");
        names.add("Dilan");

        ArrayVector myNames = ArrayVector.unmodifiableArrayVector(names);
        System.out.println(myNames);
//        System.out.println(myNames.add("Alex")); //out exception
    }

    private void initVariables() {
        initArrayVectorString();
        initArrayVectorNumber();
        initArrayVectorInteger();
    }

    private void initArrayVectorString() {
        arrayVectorString.add("Hello");
        arrayVectorString.add("Derek");
        arrayVectorString.add("How are you?");
    }

    private void initArrayVectorNumber() {
        for (int i = 1; i < 4; i++) {
            arrayVectorNumber.add(i);
        }
    }

    private void initArrayVectorInteger() {
        for (int i = 1; i < 4; i++) {
            arrayVectorInteger.add(i);
        }
    }


}
