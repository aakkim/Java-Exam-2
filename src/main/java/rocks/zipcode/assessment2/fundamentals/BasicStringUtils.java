package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String reverse = "";
        for(int i=string1.length()-1; i>=0; i--) {
            reverse += string1.charAt(i);
        }
        return reverse;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reverse1 = "";
        String reverse2 = "";
        for(int i=string1.length()-1; i>=0; i--) {
            reverse1 += string1.charAt(i);
        }
        for(int i=string2.length()-1; i>=0; i--) {
            reverse2 += string2.charAt(i);
        }
        return reverse1 + reverse2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String newString = "";
        for(int i=0; i<string.length(); i++) {
            char c = string.charAt(i);
            if(charactersToRemove.indexOf(c) == -1) { // if character in string doesn't exist
                newString += c;
            }
        }
        return newString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String newString = "";
        String reverse = "";
        for(int i=0; i<string.length(); i++) {
            char c = string.charAt(i);
            if(charactersToRemove.indexOf(c) == -1) { // if character in string doesn't exist
                newString += c;
            }
        }
        for(int i=newString.length()-1; i>=0; i--) {
            reverse += newString.charAt(i);
        }
        return reverse;
    }
}
