class Solution {
    public int fib(int n) {
        if(n==0){
           return 0;

        }if(n==1){
            return 1;
        } 
       {
       
return fib(n-1)+fib(n-2);

        }
       
        
    }

    public static void main(String args[]){
       
       int n=3;
       Solution s= new Solution();
      System.out.println(s.fib(n));
       }
    }