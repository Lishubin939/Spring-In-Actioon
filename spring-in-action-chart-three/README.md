# Spring-In-Action-Two
## 根据环境不同产生不同的Bean
环境主要分为dev,prod,test 三种环境。而如果在不同环境都需要重新修改再编译的话其本身的存在硬编码问题。
为了解决这个问题，spring引入了条件bean。
**所有外部bean均使用xml来进行配置，这样可以一定程度上解决硬编码,自己新建的类使用JavaConfig的方式**
### javaConfig
在JavaConfig中，可以把不同环境的Bean放在同一个Config类中。
主要使用`@Bean`与`@Profile`来标记创建的类
```
    @Bean
    @Profile("dev")
    public ProfileBean devBean(){
        return new DevBean();
    }
```
### xml方式
xml方式有问题待解决。
##激活方法
1. 在web.xml中的DispathchServlet中加入启动参数`spring.profiles.active`或者`spring.profiles.default`
加入对应的环境。这一点在mvc中说明
2. 测试环境使用`@ActiveProfiles`来激活对应的bean

##  根据条件创建Bean
有时会需要在第三方Bean完成创建后，将创建一些第三方Bean。
这就使得Bean如果没有创建就不在创建新的Bean。
在依赖Bean的实例化时，加入`@Conditional`注解，该注解需要传递一个类并实现`Condition`接口。`Condition`接口中
包含match方法，当match方法返回true时创建类，反之不创建。
```
    @Bean
    @Conditional(PreBeanIsExistsCondition.class)
    public AfterBean afterBean(){
        return new AfterBean();
    }
```
条件判断：
```java
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


        while (beanNamesIterator.hasNext()){
            String beanName = beanNamesIterator.next();
            if ("preBean".equals(beanName)){
                return true;
            }
        }
        return false;


    }
}
```
**ConditionContext可以做到以下几点:**
- getRegistry 返回BeanDefinitionRegistry 用于检查Bean的定义.
- getBeanFactory() 返回ConfigurableListableBeanFactory 可以检查整个spring容器中的bean情况
- getEnvironment() 返回Environment 用于检查环境变量和对应的值
- getClassLoader() 用于检查类是否存在

## Bean的歧义性
限定：
1. @primary 在Bean生产时加入注解，当发生歧义时，调用primary的bean
2. @Qualifier 可以在@AutoWired时加入指定Bean的名称，Bean的ID为类名首字母小写
3. 在Bean上加入@Qualifier("a1")  在@AutoWired时@Qualifier("a1") 指定@Qualifier("a1") 允许多个@Qualifier
来控制Bean的范围。
4. 自定义限定符注解：定义自定义注解后 **在产生Bean的地方** 和**@AutoWired**注入的地方使用
```java
@Target({
        ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,
        ElementType.METHOD,ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Woman {
}
```
