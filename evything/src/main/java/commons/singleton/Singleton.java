package commons.singleton;

/**
 * Created by sfeng on 2016/10/29.
 */
public class Singleton {

    private Singleton() {
    }


    public static class SingletonFac {
        private static Singleton instance = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonFac.instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }

}
