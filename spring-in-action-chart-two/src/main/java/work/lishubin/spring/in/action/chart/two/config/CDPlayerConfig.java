package work.lishubin.spring.in.action.chart.two.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.lishubin.spring.in.action.chart.two.soundsystem.CompactDisc;
import work.lishubin.spring.in.action.chart.two.soundsystem.SgtPeppers;

/**
 * @author 李树彬
 * @date 2019/2/26  10:40
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }


}
