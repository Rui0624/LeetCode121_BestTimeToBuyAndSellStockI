
public class Solution {
	public int maxProfit(int[] prices) {
        int res = 0;
        int buy = Integer.MAX_VALUE;
        for(int num : prices){
        	buy = Math.min(buy, num);
        	res = Math.max(num - buy, res);
        }
        return res;
    }
}
