class Solution {
    public long countOfSubstrings(String word, int k) {
        return kConstants(word,k)-kConstants(word,k+1);
        
    }
    long kConstants(String w, int k){
        int l=0;
        int r=0;
        int n=w.length();
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        int cont=0;
        long ans=0;
        while(r<n || l<n){   
            if( a>0 && e>0 && i>0 && o>0 && u>0 && cont>=k){
                ans+=n-r+1;
                char c=w.charAt(l);
                if(c=='a')
                    a--;
                else if(c=='e')
                    e--;
                else if(c=='i')
                    i--;
                else if(c=='o')
                    o--;
                else if(c=='u')
                    u--;
                else
                    cont--;
                l++;
            }
            else{
                if(r==n)
                break;
                char ch=w.charAt(r);
            if(ch=='a')
                a++;
            else if(ch=='e')
                e++;
            else if(ch=='i')
                i++;
            else if(ch=='o')
                o++;
            else if(ch=='u')
                u++;
            else
                cont++;
                r++;
            }
        }
        return ans;
    }
}