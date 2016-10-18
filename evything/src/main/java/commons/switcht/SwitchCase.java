package commons.switcht;

/**
 * Created by sfeng on 2016/10/14.
 */
public class SwitchCase {

    public int swticht(int i){
        int result=0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i;
            case 3:
                result=result +i;
        }

        return result;
    }

    public static void main(String[] args) {
        SwitchCase sc=new SwitchCase();
        System.out.println(sc.swticht(2));
    }
}
