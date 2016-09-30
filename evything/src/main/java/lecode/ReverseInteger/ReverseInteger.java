package lecode.ReverseInteger;

/**
 * Created by sfeng on 2016/9/19.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int res=0;
        int flag=1;
        if(x<0){
            flag=-1;
            x=-x;
        }

        while(x>0){
            res=res*10+x%10;
            x=x/10;
        }

        return res*flag;

    }
}
