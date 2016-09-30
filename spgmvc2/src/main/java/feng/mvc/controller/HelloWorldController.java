package feng.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sfeng on 2016/9/30.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.addAttribute("greeting","欢迎：greeting");
        return "welcome";
    }

    @RequestMapping(value = "/helloagain",method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model){
        model.addAttribute("greeting","再次欢迎：greeting");
        return "welcome";
    }
}
