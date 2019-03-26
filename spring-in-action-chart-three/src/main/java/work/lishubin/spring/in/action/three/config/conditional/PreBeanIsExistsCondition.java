package work.lishubin.spring.in.action.three.config.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import work.lishubin.spring.in.action.three.config.bean.PreBean;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/**
 * @author 李树彬
 * @date 2019/3/26  22:11
 */
public class PreBeanIsExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //检查Bean的定义
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        //检查Bean是否注册
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();


        //检查环境变量是否生效
        Environment environment = conditionContext.getEnvironment();
        ClassLoader classLoader = conditionContext.getClassLoader();

        while (beanNamesIterator.hasNext()){
            String beanName = beanNamesIterator.next();
            if ("preBean".equals(beanName)){
                return true;
            }
        }
        return false;


    }
}
