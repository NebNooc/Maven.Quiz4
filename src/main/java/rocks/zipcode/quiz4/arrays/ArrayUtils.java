package rocks.zipcode.quiz4.arrays;


/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] result = new String[values.length - 1];
        String middleElement = getMiddleElement(values);
        Integer counter = 0;

        for (String value : values) {
            if (value.equals(middleElement))
                continue;
            result[counter] = value;
            counter++;
        }
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length - 1];
        String lastElement = getLastElement(values);
        Integer counter = 0;

        for(int i = 0; i < values.length; i++) {
            if(i == values.length - 1)
                continue;
            result[counter] = values[i];
            counter++;
        }
        return result;
    }
}