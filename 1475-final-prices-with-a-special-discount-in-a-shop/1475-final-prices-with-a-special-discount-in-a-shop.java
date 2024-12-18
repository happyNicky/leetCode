class Solution {
    public int[] finalPrices(int[] prices) {
        if(prices.length==1)
            return prices;
        int[] temp= new int[prices.length];
        temp[prices.length-1]=prices[prices.length-1];
        for(int i=0;i<prices.length-1;i++)
        { for(int j=i+1;j<prices.length;j++)
          { 
            if(prices[j]<=prices[i])
               { temp[i]=prices[i]-prices[j];
                  break;
               }
            else 
                temp[i]=prices[i];
          }
            
        }
        return temp;
    }
}