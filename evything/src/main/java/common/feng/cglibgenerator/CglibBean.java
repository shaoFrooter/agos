package common.feng.cglibgenerator;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by sfeng on 2016/8/27.
 */
public class CglibBean {
    private Object object;
    private BeanMap beanMap;

    public CglibBean(){
        super();
    }

    public CglibBean(Map mp){
        this.object=this.generateBean(mp);
        this.beanMap=BeanMap.create(this.object);
    }

    public void setValue(String property,Object value){
        beanMap.put(property,value);
    }

    public Object getValue(String property){
        return beanMap.get(property);
    }

    public Object getObject(){
        return this.object;
    }

    public Object generateBean(Map mp){
        BeanGenerator generator=new BeanGenerator();
        Set keys=mp.keySet();
        Iterator it=keys.iterator();
        String key=null;
        while(it.hasNext()){
            key=(String)it.next();
            generator.addProperty(key,(Class)mp.get(key));
        }
        return generator.create();
    }
}
