import com.wuyiwen.service.UserService;
import com.wuyiwen.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        UserService userService = new UserServiceImpl();
        userService.getUser();

    }

    @Test
    public void testIoc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userservice = (UserServiceImpl) context.getBean("userservice");
        userservice.getUser();
    }
}
