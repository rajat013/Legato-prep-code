package leetcode;

public class BestTimetoBuySellStock {

	public static void main(String[] args) {

		int [] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

//		
//		int maxprofit=0;
//		
//		for (int i=0;i<prices.length;i++) {
//			
//			for (int j=i+1;j<prices.length;j++) {
//				if(maxprofit < (prices[j]-prices[i])) {
//					
//					maxprofit=prices[j]-prices[i];
//				}
//			}
//		}
//		
		
		int maxprofit=0;
		int buy=Integer.MAX_VALUE;
		int profit=0;
		
		for (int i=0;i<prices.length;i++) {
			
			if(buy>prices[i]) {
				buy=prices[i];
				
			}
			
			profit=prices[i]-buy;
			if(profit>maxprofit) {
				
				maxprofit=profit;
			}
		}
		
		
		return maxprofit;
		
		
		
		
		
		
		
	}

}
