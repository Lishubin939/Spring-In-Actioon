package work.lishubin.spring.in.action.chart.two.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 李树彬
 * @date 2019/2/26  11:54
 */
public class CDPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    public void play(){
        compactDisc.play();
    }

}
