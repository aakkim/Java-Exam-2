package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        // if negative indices are provided, throw an exception
        if(startingIndex < 0 || endingIndex < 0) {
            throw new IllegalArgumentException("Invalid indices");
        }
        //create new array with size range of difference between startingIndex and endingIndex
        String[] newArray = new String[endingIndex-startingIndex];
        int idx = 0;// variable to increment index of newArray
        for(int i=startingIndex; i<endingIndex; i++) {
            newArray[idx] = arrayToBeSpliced[i];
            idx++;
        }
        return newArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        //if startingIndex out of array range is provided, throw exception
        if(startingIndex >= arrayToBeSpliced.length) {
            throw new IllegalArgumentException("Invalid indices");
        }
        //create new array with size range of difference between startingIndex and endingIndex
        String[] newArray = new String[arrayToBeSpliced.length-startingIndex];
        int idx = 0; // index to add values to newArray
        for(int i=startingIndex; i<arrayToBeSpliced.length; i++) {
                newArray[idx] = arrayToBeSpliced[i];
                idx++;
        }
        return newArray;
    }
}
