package work.lishubin.spring.in.action.chart.two.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.lishubin.spring.in.action.chart.two.soundsystem.BlankDisc;
import work.lishubin.spring.in.action.chart.two.soundsystem.CompactDisc;

import java.util.Arrays;

/**
 * @author 李树彬
 * @date 2019/2/26  16:07
 */

public class CDConfig {


    public CompactDisc compactDisc(){
        return new BlankDisc("blankDisc","lishubin", Arrays.asList("lishubin1","lishubin2"));
    }

}
