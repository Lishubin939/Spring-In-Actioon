package work.lishubin.spring.in.action.chart.two.soundsystem;

import org.springframework.stereotype.Component;
import work.lishubin.spring.in.action.chart.two.soundsystem.CompactDisc;

/**
 * @author 李树彬
 * @date 2019/2/26  10:30
 */

@Component(value = "singleSgtPeppers")
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("SgtPeppers ");
    }
}
