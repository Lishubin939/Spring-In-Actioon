package work.lishubin.spring.in.action.chart.two.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import work.lishubin.spring.in.action.chart.two.soundsystem.CDPlayer;

/**
 * @author 李树彬
 * @date 2019/2/26  16:18
 */
@Configuration
@Import(CDPlayer.class)
@ImportResource("classpath:spring/spring-context.xml")
public class SoundSystemConfig {
}
