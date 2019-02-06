 import java.util.Formatter;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }
    

    public static int numberOfDigits(int input) {
        int i = 1;
        while ((Math.pow(10, i) - 1) < input) {
            i++;
        }
        return i;
    }
    
    public static String formatResult(int input) {
        String formatted = "";
        for (int i = 0; i < (3 - numberOfDigits(input)); i++){
            formatted = formatted + " ";
        }
        formatted = formatted + input;
        return formatted;
    }
    
    public static String getRow(int rowNumber, int tableSize) {
        String result = "";
        int maxSize = numberOfDigits(tableSize * tableSize);
        for (int i = 1; i <= tableSize; i++) {
            result = result + formatResult(i * rowNumber) + " |";
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int i = 1; i <= tableSize; i++) {
            table = table + getRow(i, tableSize) +"\n";
        }
        return table;
    }
}



