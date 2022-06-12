package arraytest;

public class ArrayTest {

    public static void main(String[] args) {
        final Integer NUMBER_OF_VALUES = 5;
        Integer values[] = new Integer[NUMBER_OF_VALUES];
        for (Integer i = 0; i < NUMBER_OF_VALUES; i++) {
            values[i] = Input.getInteger("Next value: ");

        }
        // write a code fragment to display the contents of the array - each value on its own line
        //- using an ordinary for loop
        for (Integer i = 0; i < NUMBER_OF_VALUES; i++) {
            System.out.println(values[i]);
        }
        //- using an enhanced for loop
        for (Integer i : values) {
            System.out.println(i);
        }
    }

}
