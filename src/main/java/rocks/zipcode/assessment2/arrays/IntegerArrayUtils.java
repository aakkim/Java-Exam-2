package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] newArray = new Integer[integerArray.length+1];
        for(int i=0; i< integerArray.length; i++) {
            newArray[i] = integerArray[i];
        }
        newArray[integerArray.length] = valueToBeAdded;

        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] newArray = new Integer[integerArray.length];
        for(int i=0; i< integerArray.length; i++) {
            newArray[i] = integerArray[i];
            if(i==indexToInsertAt) {
                newArray[i] = valueToBeInserted;
            }
        }
        return newArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] newArray = new Integer[integerArray.length];
        for(int i=0; i< integerArray.length; i++) {
            if(integerArray[i] % 2 == 0) {
                newArray[i] = integerArray[i] += 1;
            } else {
                newArray[i] = integerArray[i] -= 1;
            }
        }
        return newArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] newArray = new Integer[integerArray.length];
        for(int i=0; i< integerArray.length; i++) {
            if(integerArray[i] % 2 == 0) {
                newArray[i] = integerArray[i] += 1;
            } else {
                newArray[i] = integerArray[i];
            }
        }
        return newArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] newArray = new Integer[input.length];
        for(int i=0; i< input.length; i++) {
            if(input[i] % 2 != 0) {
                newArray[i] = input[i] -= 1;
            } else {
                newArray[i] = input[i];
            }
        }
        return newArray;
    }
}
