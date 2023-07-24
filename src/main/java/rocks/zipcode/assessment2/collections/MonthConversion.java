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
    private Map<Integer, String> month;

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
            if(month.get(monthNumber)==null) {
                throw new NullPointerException();
            }
            month.get(monthNumber);
        } catch(NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        return month.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        int num = 0;
        if(!month.containsValue(monthName)) {
            return (Integer)null;
        } else {
            for(int m: month.keySet()) {
                if(month.get(m).equals(monthName)) {
                    num = m;
                }
            }
        }
        return num;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return month.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return month.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        if(month.containsKey(monthNumber)) {
            month.put(monthNumber, monthName);
        }
    }
}
