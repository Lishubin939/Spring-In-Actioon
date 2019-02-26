import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import work.lishubin.spring.in.action.chart.two.config.CDPlayerConfig;
import work.lishubin.spring.in.action.chart.two.soundsystem.CompactDisc;

/**
 * @author 李树彬
 * @date 2019/2/26  10:44
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd);
    }

}
