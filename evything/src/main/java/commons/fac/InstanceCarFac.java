package commons.fac;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sfeng on 2016/8/29.
 */
public class InstanceCarFac {
    private Map<String, Car> cars = null;

    public InstanceCarFac() {
        cars = new HashMap<String, Car>();
        cars.put("audi", new Car("audi", 300000));
        cars.put("ford", new Car("ford", 400000));
    }

    public Car getCar(String name) {
        return cars.get(name);
    }
}
