package work.lishubin.spring.in.action.three.config.bean;

import org.springframework.stereotype.Component;

/**
 * @author 李树彬
 * @date 2019/3/26  20:37
 */

public class DevBean implements ProfileBean {


    @Override
    public String message() {
        return "DevBean";
    }
}
