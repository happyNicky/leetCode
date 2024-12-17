class Solution {
    public boolean isPerfectSquare(int num) {
         if(num==0|| num==1) return true;
        int mid= num/2;
        int start=0;
       int  end=num/2;
        while(start<=end)
        {   mid= (int)(start+end)/2;   
           if((long)mid*mid>num)
             end=mid-1;
           else if((long)mid*mid==num)
               return true;
           else 
               start= mid+1;   
         }
        return false;
    }
}