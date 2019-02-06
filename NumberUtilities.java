


public class NumberUtilities {

    public static String getRange(int stop) {
              return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
       return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String ret = "";
        for (int i = start; i < stop; i = i + step) {
            ret = ret + i;
        }
        return ret;
    }

    public static String getEvenNumbers(int start, int stop) {
        return getRange(start % 2 == 1 ? start + 1 : start, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        return getRange(start % 2 == 0 ? start + 1 : start, stop, 2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String ret = "";
        int j = 0;
        for (int i = start; i <= stop; i++) {
            j = (int) Math.pow(i, exponent);
            ret = ret + j;
        }
        return ret;
    }
}
