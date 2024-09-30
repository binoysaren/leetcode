class CustomStack {
    int[] st;
    int n;
    int index;
    public CustomStack(int maxSize) {
       st=new int[maxSize];
       n=maxSize;
       index=0; 
    }
    
    public void push(int x) {
      if(index<n){
        st[index++]=x;
      }  
    }
    
    public int pop() {
      if(index==0){
        return -1;
      }  
      return st[--index];
    }
    
    public void increment(int k, int val) {
        if(st.length==0){
            return ;
        }
        for(int i=0;i<k && i<st.length;i++){
            st[i]=st[i]+val;
        }
    }
}
