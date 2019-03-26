package work.lishubin.spring.in.action.three.config.bean;

/**
 * @author 李树彬
 * @date 2019/3/26  20:37
 */
public class ProdBean implements ProfileBean {
    @Override
    public String message() {
        return "ProdBean";
    }
}
