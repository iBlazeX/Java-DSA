//2525. Categorize Box According to Criteria

public class CategorizeAccToCriteria {
    public static String categorizeBox(int l, int w, int h, int m) {
        int volume = l*w*h;
        if ((l >= 10000 || w>= 10000 || h>=1000 || volume >= 1000000000) && m >= 100) {
            return "Both";            
        }
        else if (m >= 100) {
            return "Heavy";
        }
        else if (l >= 10000 || w>= 10000 || h>=1000 || volume >= 1000000000) {
            return "Bulky";
        }
        return "neither";
    }
}
