package common.feng.fac;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sfeng on 2016/8/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationXML/beans_fac.xml")
public class Test extends AbstractJUnit4SpringContextTests {
    @org.junit.Test
    public void test(){
        Car car1=(Car)this.applicationContext.getBean("car2");
        System.out.println(car1);
    }
}
