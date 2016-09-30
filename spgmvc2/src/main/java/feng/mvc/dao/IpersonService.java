package feng.mvc.dao;

import feng.mvc.bean.Person;

import java.util.List;

/**
 * Created by sfeng on 2016/9/30.
 */
public interface IpersonService {

    public Person getPersonDetail(Integer id);

    public List<Person> getAllUser();
}
