package feng.mvc.controller;

import feng.mvc.bean.Person;
import feng.mvc.dao.IpersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sfeng on 2016/9/30.
 */

@RestController
@RequestMapping("/data")
public class PersonController {

    @Autowired
    private IpersonService ipersonService;
    @RequestMapping("/person")
    public Person getPersonDetail(@RequestParam(value="id",required = false,defaultValue = "0") Integer id){

        Person p=ipersonService.getPersonDetail(id);

        return p;

    }
}
