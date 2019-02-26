package work.lishubin.spring.in.action.chart.two.work.bean;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 李树彬
 * @date 2019/2/26  16:51
 */
@Component
public class Scene {

    private List<BaseRole> personList;

    public void play(){
        for (BaseRole role:personList){
            role.attack();
        }
    }




}
