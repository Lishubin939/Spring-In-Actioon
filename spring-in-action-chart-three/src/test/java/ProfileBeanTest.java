
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import work.lishubin.spring.in.action.three.config.ContextConfig;
import work.lishubin.spring.in.action.three.config.bean.ProfileBean;

/**
 * @author 李树彬
 * @date 2019/3/26  20:44
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ContextConfig.class)
@ContextConfiguration(locations = {"classpath:spring-context-*.xml"})
@ActiveProfiles(profiles = "test")

public class ProfileBeanTest {

    @Autowired
    private ProfileBean profileBean;

    @Test
    public void test(){
        Assert.assertEquals("TestBean",profileBean.message());
    }

}
