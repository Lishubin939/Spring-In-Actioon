package work.lishubin.spring.in.action.chart.two.work.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.lishubin.spring.in.action.chart.two.work.bean.Sword;
import work.lishubin.spring.in.action.chart.two.work.bean.Weapon;

/**
 * @author 李树彬
 * @date 2019/2/26  17:06
 */
@Configuration
public class WeaponConfig {


    @Bean
    public Weapon weapon(){
        return new Sword();
    }


}
