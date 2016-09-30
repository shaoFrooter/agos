package ttiao.t1;

import java.util.Scanner;

/**
 * Created by sfeng on 2016/9/28.
 */
public class Main {

    public int matchStr(String stg){
        int count=1;
        StringBuilder res=new StringBuilder();
        if(stg==null||stg.length()==0){
            return 0;
        }
        int stg_len=stg.length();
        for(int i=1;i<stg_len;i++){
            res.delete(0,res.length());
            res=res.append(stg.substring(i,stg_len)).append(stg.substring(0,i));
            if(res.toString().equals(stg)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Main m=new Main();
        System.out.println(m.matchStr(s));
    }
}
