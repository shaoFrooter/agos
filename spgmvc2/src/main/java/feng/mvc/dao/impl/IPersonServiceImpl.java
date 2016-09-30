package feng.mvc.dao.impl;

import feng.mvc.bean.Person;
import feng.mvc.dao.IpersonService;
import org.springframework.stereotype.Component;

/**
 * Created by sfeng on 2016/9/30.
 */
@Component("ipersonService")
public class IPersonServiceImpl implements IpersonService {

    public Person getPersonDetail(Integer id) {
        Person per=new Person();
        per.setId(id);
        per.setName("tom");
        per.setLocation("usa");
        return per;
    }
}
