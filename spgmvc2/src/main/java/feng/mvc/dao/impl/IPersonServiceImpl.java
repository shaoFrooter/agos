package feng.mvc.dao.impl;

import feng.mvc.bean.Person;
import feng.mvc.dao.IpersonService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public List<Person> getAllUser() {

        List<Person> pers=new ArrayList<Person>();

        Person per=new Person();
        per.setId(1);
        per.setName("tom");
        per.setLocation("usa");

        Person per2=new Person();
        per.setId(2);
        per.setName("tom");
        per.setLocation("usa");

        pers.add(per);
        pers.add(per2);

        return pers;
    }
}
