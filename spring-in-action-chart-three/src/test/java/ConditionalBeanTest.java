import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.dc.pr.PRError;
import work.lishubin.spring.in.action.three.config.ContextConfig;
import work.lishubin.spring.in.action.three.config.bean.AfterBean;
import work.lishubin.spring.in.action.three.config.bean.Person;
import work.lishubin.spring.in.action.three.config.bean.PreBean;
import work.lishubin.spring.in.action.three.config.qualifier.Man;

/**
 * @author 李树彬
 * @date 2019/3/26  22:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ContextConfig.class)
public class ConditionalBeanTest {

    @Autowired
    private PreBean preBean;

    @Autowired
    private AfterBean afterBean;

    @Autowired
    @Man
    private Person person;

    @Test
    public void conditionTest(){
//        Assert.assertNotNull(preBean);
        Assert.assertNotNull(afterBean);
    }

    @Test
    public void primaryTest(){
        Assert.assertEquals("Man",person.talk());
    }


}
