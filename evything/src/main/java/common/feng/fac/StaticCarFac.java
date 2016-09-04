package common.feng.fac;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sfeng on 2016/8/29.
 */
public class StaticCarFac {
    private static Map<String,Car> cars=new HashMap<String, Car>();

    static {
        cars.put("audi",new Car("audi",3000000));
        cars.put("ford",new Car("ford",4000000));

    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
