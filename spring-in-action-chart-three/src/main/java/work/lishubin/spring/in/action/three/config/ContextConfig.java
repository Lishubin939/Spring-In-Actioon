package work.lishubin.spring.in.action.three.config;

import org.springframework.context.annotation.*;
import work.lishubin.spring.in.action.three.config.bean.*;
import work.lishubin.spring.in.action.three.config.conditional.PreBeanIsExistsCondition;

/**
 * @author 李树彬
 * @date 2019/3/26  20:36
 */

@Configuration
public class ContextConfig {

    @Bean
    @Profile("dev")
    public ProfileBean devBean(){
        return new DevBean();
    }

    @Bean
    @Profile("prod")
    public ProfileBean prodBean(){
        return new ProdBean();
    }
    @Bean
    @Profile("test")
    public ProfileBean testBean(){
        return new TestBean();
    }

    @Bean
    public PreBean preBean(){
        return new PreBean();
    }
    @Bean
    @Conditional(PreBeanIsExistsCondition.class)
    public AfterBean afterBean(){
        return new AfterBean();
    }

    @Bean
    @work.lishubin.spring.in.action.three.config.qualifier.Man
    public Person man(){
        return new Man();
    }
    @Bean
    @work.lishubin.spring.in.action.three.config.qualifier.Woman
    public Person woman(){
        return new Woman();
    }

}
