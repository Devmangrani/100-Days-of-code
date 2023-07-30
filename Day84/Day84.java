//package Buy And Sell Stocks;

public class Day84 {
    public static int buyAndsellStocks(int StocksPrice[]) {
        int buyingPrice = Integer.MAX_VALUE; //-infinity
        int MaxProfit = 0;
        for (int i = 0; i < StocksPrice.length; i++) {
            if (buyingPrice < StocksPrice[i]) { //Profit
                int Profit = StocksPrice[i] - buyingPrice;
                MaxProfit = Math.max(MaxProfit, Profit);
            }else {
                buyingPrice = StocksPrice[i];

            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int StocksPrice[] = {7,1,5,3,6,4};
        System.out.println("Your Max Profit is : "+buyAndsellStocks(StocksPrice));
    }
}
