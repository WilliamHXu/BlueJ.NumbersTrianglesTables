


public class NumberUtilities {

    public static String getRange(int stop) {
        String ret = "";
        for (int i = 0; i < stop; i++) {
            ret = ret + i;
        }
        return ret;
    }

    public static String getRange(int start, int stop) {
        String ret = "";
        for (int i = start; i < stop; i++) {
            ret = ret + i;
        }
        return ret;
    }


    public static String getRange(int start, int stop, int step) {
        String ret = "";
        for (int i = start; i < stop; i = i + step) {
            ret = ret + i;
        }
        return ret;
    }

    public static String getEvenNumbers(int start, int stop) {
        String ret = "";
        for (int i = start; i < stop; i = i + 2) {
            if (i % 2 == 1) {
                i++;
            }
            ret = ret + i;
        }
        return ret;
    }


    public static String getOddNumbers(int start, int stop) {
        String ret = "";
        for (int i = start; i < stop; i = i + 2) {
            if (i % 2 == 0) {
                i++;
            }
            ret = ret + i;
        }
        return ret;
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
