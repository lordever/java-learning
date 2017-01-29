import java.util.List;

public class Demo {
    List<String> arrayVectorString = new ArrayVector();
    List<Integer> arrayVectorNumber = new ArrayVector();
    List<Integer> arrayVectorInteger = new ArrayVector();

    public void start() {
        initVariables();
        quest1();
        quest2();
    }

    private void quest1() {
        System.out.println(arrayVectorString.toString());
    }

    private void quest2() {
        if (arrayVectorString.equals(arrayVectorNumber))
            System.out.println("arrayVectorString = arrayVectorNumber"); //false
        else
            System.out.println("arrayVectorString != arrayVectorNumber"); //true

        if (arrayVectorInteger.equals(arrayVectorNumber))
            System.out.println("arrayVectorInteger = arrayVectorNumber"); //true
        else
            System.out.println("arrayVectorInteger != arrayVectorNumber"); //false
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
