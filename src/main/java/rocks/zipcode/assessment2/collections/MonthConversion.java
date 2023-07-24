package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    private Map<Integer, String> month; //declare a map to store integer of month as key, name of month as value

    public MonthConversion() {
        month = new TreeMap<>();
    }
    public void add(Integer monthNumber, String monthName) {
        month.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        try {
            //if value is null, throw exception
            if(month.get(monthNumber)==null) {
                throw new NullPointerException();
            }
            //else get the value using the provided key monthNumber
            month.get(monthNumber);
            //return exception should one occur
        } catch(NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        return month.get(monthNumber);//return value of provided key
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        int num = 0; //use to store key for provided value
        try {
            //if value is not in map, return null
            if (!(month.containsValue(monthName))) {
                return (Integer)null;
            }
            //else iterate through keys and if value of corresponding key equals provided value, assign key to num
            for (int m : month.keySet()) {
                if (month.get(m).equals(monthName)) {
                    num = m;
                }
            }
            //return exception if it occurs
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e);
        }
        return num;
    }


    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return month.containsKey(monthNumber);
        //returns true if month includes provided key
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return month.containsValue(monthName);
        //returns true if month includes provided value
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.size();// get size/number of key/value pairs in month
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        if(month.containsKey(monthNumber)) {
            //if month contains key, update with new value
            month.put(monthNumber, monthName);
        }
    }
}
