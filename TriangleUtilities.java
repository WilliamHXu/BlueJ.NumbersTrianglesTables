 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i = 0; i < numberOfStars; i++) {
            result = result + "*";
        }
        return result;
    }
    
    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 1; i <= numberOfRows; i++) {
            result = result + getRow(i) + "\n";
        }
        return result;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
