/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1;
        int high=n;
        int mid=-1;
        int myguess=-2;
        while(low<=high ){
            mid=low+(high-low)/2;
            myguess=guess(mid);
            if(myguess==0){
                return mid;
            }
            if(myguess==-1){
                high=mid-1;
            }
            else if(myguess==1){
                low=mid+1;
            }
        }
        return -1;
    }
}