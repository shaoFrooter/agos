package ttiao.t2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sfeng on 2016/9/28.
 */
public class Main {

    public int getNum(int n,int m){
        List<String> l=new LinkedList<String>();
        for(int i=1;i<=n;i++){
            l.add(String.valueOf(i));
        }
        Collections.sort(l);
        return Integer.parseInt(l.get(m-1));
    }

    public static void main(String[] args) {
        int n=0,m=0;
        Scanner scanner=new Scanner(System.in);

        while(true){
            n=scanner.nextInt();
            m=scanner.nextInt();
            if(n>=1&&m>=1&&n>=m){
                break;
            }
        }
        Main m1=new Main();
        System.out.println(m1.getNum(n,m));
    }
}
