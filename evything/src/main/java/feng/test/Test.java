package feng.test;

import common.feng.cglibgenerator.CglibBean;
import himanf.feng.model.UserInfo;
import himanf.feng.service.UserService;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sfeng on 2016/8/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationXML/applicationContext.xml")
public class Test extends AbstractJUnit4SpringContextTests {
    @Autowired
    private UserService userService;

    @org.junit.Test
    public  void test() throws Exception {
        //generatorTable();
       // cglibGenerator();
        UserInfo u=new UserInfo();
        u.setName("shaofeng");
        u.setEmail("shaofeng@126.com");
        System.out.println( userService.insert(u));
    }


    public static void cglibGenerator() throws Exception{
        Map propertyMap=new HashMap();
        propertyMap.put("id", Class.forName("java.lang.Integer"));

        propertyMap.put("name", Class.forName("java.lang.String"));

        propertyMap.put("address", Class.forName("java.lang.String"));

        CglibBean cglibBean=new CglibBean(propertyMap);
        Object obj=cglibBean.getObject();
        Class c=obj.getClass();

        Method[] ms=c.getDeclaredMethods();
        for (Method m:ms){
            System.out.println(m.getName());
        }
    }

    //mybatis generator
    public static void generatorTable() {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        String genCfg = "configs/generatorConfig.xml";

        File configFile = new File(Test.class.getClassLoader().getResource("").getFile()+genCfg);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {
            config = cp.parseConfiguration(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = null;
        try {
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
