package mousejava.study.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by wuhao1 on 2016/8/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationServlet-mvc.xml"})
public class TestVariousProxy {

    //http://www.cnblogs.com/ityouknow/p/5329550.html

        @Test
        public void testAop(){
            ApplicationContext ac = new ClassPathXmlApplicationContext("proxy.xml");
//            Sleepable sleepable = (Sleepable)ac.getBean("personProxy");
//            sleepable.sleep();
        }




}
