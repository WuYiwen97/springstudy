import com.wuyiwen.CDPlayer;
import com.wuyiwen.CDPlayerConfig;
import com.wuyiwen.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Resource
    private CompactDisc cd;

    @Autowired(required = false)
    private CDPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play1(){
        cdPlayer.play();
    }
}
