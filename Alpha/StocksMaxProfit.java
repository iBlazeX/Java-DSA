public class StocksMaxProfit {
    public static int profit(int n[]) {
        int c;
        int m = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int i=0; i<n.length; i++) {
            
            c = n[i];
            m = Math.min(c, m);
            maxDiff = Math.max(c-m, maxDiff);
        }
        if (maxDiff<=0) {
            return 0;
        }
        return maxDiff;
        
    }

    public static void main(String[] args) {
        int numbers[] = {9, 9, 7, 7};
        int a = profit(numbers);
        System.out.println(a);
    }

}
