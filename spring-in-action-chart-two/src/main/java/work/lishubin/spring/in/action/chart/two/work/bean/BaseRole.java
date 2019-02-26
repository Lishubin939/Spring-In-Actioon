package work.lishubin.spring.in.action.chart.two.work.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 李树彬
 * @date 2019/2/26  16:52
 */
public abstract class BaseRole {

    private String name;
    private String strength;
    private String intellect;
    private String agile;

    @Autowired
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getIntellect() {
        return intellect;
    }

    public void setIntellect(String intellect) {
        this.intellect = intellect;
    }

    public String getAgile() {
        return agile;
    }

    public void setAgile(String agile) {
        this.agile = agile;
    }

    public void attack(){
        weapon.attack();
    }
}
