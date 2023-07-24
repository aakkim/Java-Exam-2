package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        int pad = amountOfPadding - stringToBePadded.length();
        String padSpace = "";
        for(int i=1; i<=pad; i++) {
            padSpace += " ";
        }
        return padSpace + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        int pad = amountOfPadding - stringToBePadded.length();
        String padSpace = "";
        for(int i=1; i<=pad; i++) {
            padSpace += " ";
        }
        return stringToBePadded + padSpace;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = "";
        for(int i=1; i<=numberOfTimeToRepeat; i++) {
            repeated += stringToBeRepeated;
        }
        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        for(int i=0; i<string.length(); i++) {
            // using Character class method isLetter and isWhitespace to check if character is a space or letter
            if(!(Character.isLetter(string.charAt(i))) && !(Character.isWhitespace(string.charAt(i)))) {
                return false;
            }
        }
        return true;


//        for(int i=0; i<string.length(); i++) {
//            char c = string.charAt(i);
//            if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c==' ')) {
//                return false;
//            }
//        }
//        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for(int i=0; i<string.length(); i++) {
            // using Character class method isDigit, we check if the character is a digit
            if(!(Character.isDigit(string.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return string.matches("[^\\w]+");
        /* regular expression to not match any alphanumeric characters
        ^ means not
        \\w means any word/alphanumeric character
        + means one or more occurrences
        the entire expression says match with any characters that is not alphanumeric
         */
    }
}
