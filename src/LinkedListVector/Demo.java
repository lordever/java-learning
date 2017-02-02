package LinkedListVector;

import java.util.LinkedList;

public class Demo {
    private LinkedListVector<String> linkedVectorString = new LinkedListVector();
    private LinkedListVector<Integer> linkedVectorNumber = new LinkedListVector();
    private LinkedListVector<Integer> linkedVectorInteger = new LinkedListVector();

    public void start() {
        initVariables();
        linkedQuest1();
        linkedQuest2();
        linkedQuest3();
        linkedQuest4();
        linkedQuest5();
    }

    private void linkedQuest1() {
        System.out.println("Quest 1:");
        System.out.println(linkedVectorInteger.toString());
    }

    private void linkedQuest2() {
        System.out.println("\nQuest 2:");
        if (linkedVectorString.equals(linkedVectorNumber))
            System.out.println("linkedVectorString = linkedVectorNumber"); //false
        else
            System.out.println("linkedVectorString != linkedVectorNumber"); //true

        if (linkedVectorInteger.equals(linkedVectorNumber))
            System.out.println("linkedVectorInteger = linkedVectorNumber"); //true
        else
            System.out.println("linkedVectorInteger != linkedVectorNumber"); //false
    }

    private void linkedQuest3() {
        System.out.println("\nQuest 3:");
        if (linkedVectorString.hashCode() == linkedVectorNumber.hashCode())
            System.out.println("linkedVectorString = linkedVectorNumber"); //false
        else
            System.out.println("linkedVectorString != linkedVectorNumber"); //true
        if (linkedVectorInteger.hashCode() == linkedVectorNumber.hashCode())
            System.out.println("linkedVectorInteger = linkedVectorNumber"); //true
        else
            System.out.println("linkedVectorInteger != linkedVectorNumber"); //false
    }

    private void linkedQuest4(){
        System.out.println("\nQuest 4:");
        LinkedListVector<Integer> cloneVectorInteger = (LinkedListVector<Integer>) linkedVectorInteger.clone();
        System.out.println(cloneVectorInteger.toString());
    }

    private void linkedQuest5() {
        System.out.println("\nQuest 5:");
        LinkedList<String> names = new LinkedList<String>();
        names.add("Marta");
        names.add("Derek");
        names.add("Dilan");

        LinkedListVector myNames = LinkedListVector.unmodifiableArrayVector(names);
        System.out.println(myNames);
        System.out.println(myNames.add("Alex")); //out exception
    }

    private void initVariables() {
        initArrayVectorString();
        initLikedVectorNumber();
        initLinkedVectorInteger();
    }

    private void initArrayVectorString() {
        linkedVectorString.add("Hello");
        linkedVectorString.add("Derek");
        linkedVectorString.add("How are you?");
    }

    private void initLikedVectorNumber() {
        for (int i = 1; i < 4; i++) {
            linkedVectorNumber.add(i);
        }
    }

    private void initLinkedVectorInteger() {
        for (int i = 1; i < 4; i++) {
            linkedVectorInteger.add(i);
        }
    }


}
