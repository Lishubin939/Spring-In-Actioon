package work.lishubin.spring.in.action.chart.two.soundsystem;

import java.util.List;

/**
 * @author 李树彬
 * @date 2019/2/26  15:40
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title,String artist,List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }


    @Override
    public void play() {
        System.out.println(String.format("%s %s",title,artist));
    }
}
