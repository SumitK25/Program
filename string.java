class Solution {
    public int solution(int[] A) 
    {
    int res = 0;
    int res1 = 0;
    boolean B = true;
    int r=-1;
    
    for (int i = 1; i < A.length; i++)
    {
        if ((A[i] > A[i - 1]) == B)
        {
            res++;
        }
        else
        {
            res1++;
        }
        B = !B;
    }

    //return res > res1 ? (A.length - 1) - res : (A.length - 1) - res1;
   if(res>res1){
       r=(A.length-1)-res;
   }
   else
        r=(A.length-1)-res1;
    return r;
    }
}