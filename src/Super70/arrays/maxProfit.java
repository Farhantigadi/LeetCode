package Super70.arrays;

public class maxProfit {
    public static void main(String[] args) {
        int a[] = {1,2,0,5,7,17};
        System.out.println(maxProfit1(a));
    }
    public static  int maxProfit1(int[] prices ) {
        if (prices ==  null || prices.length == 0) {
            return 0;

        }
        int maxprofit =0;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int profit = prices[i] - min;
            if(profit>maxprofit){
                maxprofit = profit;
            }

            }
        }
        return maxprofit;
    }
}
