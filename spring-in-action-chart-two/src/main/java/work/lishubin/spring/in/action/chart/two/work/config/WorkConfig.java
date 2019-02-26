package work.lishubin.spring.in.action.chart.two.work.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import work.lishubin.spring.in.action.chart.two.work.bean.BaseRole;

/**
 * @author 李树彬
 * @date 2019/2/26  17:05
 */

@Configuration
@ComponentScan(basePackageClasses = BaseRole.class)
@Import(WeaponConfig.class)
public class WorkConfig {



}
