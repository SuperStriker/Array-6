TC: O(n)
SC: O(1)

200 / 200 test cases passed.
Status: Accepted                                                                                                      
Runtime: 1 ms




class Solution {
    public int maxProfit(int[] prices) {
        
        int minval=Integer.MAX_VALUE;
        int maxprofit=0;
        
        for(int price: prices){
            int diff = price - minval;
            if(minval> price){
                minval=price;
            }else if( diff > maxprofit){
                    maxprofit=diff;
            }
        }
        
        return maxprofit;
    }
}
