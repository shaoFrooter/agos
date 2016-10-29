package commons.singleton;

/**
 * Created by sfeng on 2016/10/29.
 */
public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 instance=null;

    public static Singleton2 getInstance(){
        if(instance==null){
            synchronized (Singleton2.class){
                if(instance==null){
                    instance=new Singleton2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
    }
}
