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
        //create new array with a length of original array + 1 since we are adding another value
        Integer[] newArray = new Integer[integerArray.length+1];
        for(int i=0; i< integerArray.length; i++) {
            newArray[i] = integerArray[i];
        }
        //after adding values of original array to new array, add the value to be added to the end of new array
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
        //loop through array
        for(int i=0; i< integerArray.length; i++) {
            // at the index to insert new value, replace value
            if(i==indexToInsertAt) {
                integerArray[i] = valueToBeInserted;
            }
        }
        return integerArray;
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
        //loop through array
        for(int i=0; i< integerArray.length; i++) {
            //if value is even, increment value by 1
            if(integerArray[i] % 2 == 0) {
                integerArray[i] += 1;
            //if value is odd, decrement value by 1
            } else {
                integerArray[i] -= 1;
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        //loop through array
        for(int i=0; i< integerArray.length; i++) {
            //if value is even, increment value by 1
            if(integerArray[i] % 2 == 0) {
                integerArray[i] += 1;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        //loop through array
        for(int i=0; i< input.length; i++) {
            //if value is odd, decrement value by 1
            if(input[i] % 2 != 0) {
                input[i] -= 1;
            }
        }
        return input;
    }
}
