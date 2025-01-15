class Solution {
    public int minimizeXor(int num1, int num2) {
        String a = Integer.toBinaryString(num1);
        String b = Integer.toBinaryString(num2);
        System.out.println(a+" "+b);
        int setbit = 0,asetbit=0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                setbit++;
            }
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                asetbit++;
            }
        }
        int n = a.length();
        // if (n == setbit) {
        //     return num1;
        // }
        int size = n + setbit;
        char[] temp = new char[size];
        for (int i = 0; i < size; i++) {
            temp[i] = '0';
        }
        int start = size - a.length();
        for (int i = 0; i < a.length(); i++) {
            temp[start+ i] = a.charAt(i);
        }
        int newsetbit=0;
        if(setbit>asetbit){
            newsetbit=setbit-asetbit;
            System.out.println("jdfhdvfdvf");
            for(int i=size-1;i>=0 && newsetbit>0 ;i--){
            if(temp[i]=='0'){
                temp[i]='1';
                newsetbit--;
            }
         }
        }
        else{
            newsetbit=asetbit-setbit;
            System.out.println(newsetbit);
            for(int i=size-1;i>=0 && newsetbit>0 ;i--){
            if(temp[i]=='1'){
                temp[i]='0';
                newsetbit--;
            }
          }
        }
        for (int i = 0; i < size; i++) {
             System.out.println(temp[i]);
         }
        int ans = 0;
        int mul=1;
        for(int i=size-1;i>=0;i--){
            ans+=(temp[i]-'0')*mul;
            mul*=2;
        }
        return ans;
    }
}