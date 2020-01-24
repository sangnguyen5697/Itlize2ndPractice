 



/**
 * Created by Yang on 1/23/20.
 */
import java.util.*;
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array.length >= 2 ? array[1] : null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array.length >= 2? array[array.length - 2] : null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String str: array) {
            if (str.equals(value)) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int left = 0, right = array.length - 1;
        
        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int left = 0, right = array.length - 1;
        
        while (left < right) {
            if (!array[left].equals(array[right])) return false;
            left++;
            right--;
        }
        
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Set<Character> set = new HashSet<Character>();
        for (String str : array) {
            for (char c : str.toLowerCase().toCharArray()) {
                if (Character.isLetter(c)) set.add(c);
            }
        }
        return set.size() == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfOccur = 0;
        for (String str : array) {
            if (str.equals(value)) numOfOccur++;
        }
        return numOfOccur;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> tempAL = new ArrayList<String>();
        for (String str: array) {
            if (!str.equals(valueToRemove)) tempAL.add(str);
        }
        return tempAL.stream().toArray(String[]::new);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> tempAL = new ArrayList<String>();
        int N = array.length;
        for (int i = 0; i < N; i++) {
           if (i == 0) tempAL.add(array[i]);
           else if (!array[i].equals(array[i - 1])) tempAL.add(array[i]);
        }
        return tempAL.stream().toArray(String[]::new);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if (array == null || array.length == 0) return new String[] {};
        List<String> tempAL = new ArrayList<String>();
        int N = array.length;
        String temp = array[0];
        for (int i = 1; i < N; i++) {
            if (!array[i].equals(array[i - 1])) {
                tempAL.add(temp);
                temp = array[i];
            } else {
                temp = temp + array[i];
            }
        }
        tempAL.add(temp);
        return tempAL.stream().toArray(String[]::new);
    }


}
