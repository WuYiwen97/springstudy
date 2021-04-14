import com.wuyiwen.service.UserService;
import com.wuyiwen.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);

        //UserService userService = (UserService) context.getBean("userService");
        userService.update();
    }
}
