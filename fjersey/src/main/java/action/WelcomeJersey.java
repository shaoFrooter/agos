package action;

import bean.Person;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * Created by sfeng on 2016/10/18.
 */
@Path("/wjersey")
public class WelcomeJersey {

    @GET
    @Path("getmsg")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMsg(@Context HttpServletRequest req){
        Map m=req.getParameterMap();
        for(Object o:m.keySet()){
            System.out.println(o+":"+m.get(o));
        }
        Person per=new Person();
        per.setName("邵锋");
        per.setAge(20);
        String s=JSON.toJSONString(per);
        System.out.println(s);
        return s;
    }
}
