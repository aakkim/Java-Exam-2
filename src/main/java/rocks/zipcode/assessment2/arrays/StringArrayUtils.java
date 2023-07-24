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
        String[] newArray = new String[endingIndex-startingIndex];
        int idx = 0;
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
        String[] newArray = new String[arrayToBeSpliced.length-startingIndex];
        int idx = 0;
        for(int i=startingIndex; i<arrayToBeSpliced.length; i++) {
            if(i<arrayToBeSpliced.length) {
                newArray[idx] = arrayToBeSpliced[i];
                idx++;
            }
        }
        return newArray;
    }
}
