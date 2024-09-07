class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int result =0;
        int i=0;
        int sign=1;
       while(i<n && (s.charAt(i)== ' '))
         {
            i++;
         }
         if(i==n)
          {
            return 0;
          }
         if(s.charAt(i)=='+')
          {
            sign =1;
            i++;
          }
          else if(i<n && s.charAt(i)=='-')
           {
            sign =-1;
            i++;
           }

        
        while(i<n && 0<=(int)s.charAt(i)-'0' && (int)s.charAt(i)-'0'<=9 )
        {
                
            if((result > Integer.MAX_VALUE/10 ) ||( result == Integer.MAX_VALUE/10 && (s.charAt(i)-'0')> Integer.MAX_VALUE%10))
              {
                return (sign== 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
              }
              result = result*10;
              result = result + (s.charAt(i)-'0');
              i++;
        }
             
            
        return result*sign;
    }
}