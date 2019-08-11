package boot.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class SpringU implements ApplicationContextAware {

     private  static  ApplicationContext  applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public  static Object   getBean(String name){

        return   applicationContext.getBean(name);
    }

    public <T> T  getBean(String name,Class<T> t){

        return    applicationContext.getBean(name,t);
    }


}
