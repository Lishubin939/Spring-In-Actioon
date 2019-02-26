# Spring-In-Action-Two
# 2 声明 Bean
   spring 提供了三种主要的装配机制
   - XML中显式装配
   - 在Java中进行显示装配
   - 隐式的bean发现机制和自动装配机制
   **建议：尽可能使用自动配置的机制。显式配置越少越好。但当必须要配置Bean时采用JavaConfig来装配Bean。
   当JavaConfig没有其实现时才使用XML** 
   ## 2.1 自动化装配bean
   Spring 从2个角度来实现自动化装配
   - **组件扫描:** Spring 会自动发现应用上下文中所创建的Bean。
   - **自动装配:** Spring 自动满足bean之间的依赖。  
   换而言之：就是DI时，把需要实例化的类交给Spring,Spring把类实例化好的对象放入Spring的上下文中而且自动对应
   相应的接口。
   ### 2.2.1 创建可以被发现的bean
   > CD 例子
   - 3个注解 `@Component`和`@ComponentScan`
    - 其中 `@Component` 用于告知spring 需要把哪一个类交个spring托管，一旦交给spring托管其实例化和依赖关系由
    spring解决。
    - `@ComponentScan` 用于组件扫描，扫描spring相关注解，注意只扫描和带有`@ComponentScan`注解同包下的类
    - `@AutoWired` 将Spring上下文中的对象根据依赖关系注入到当前类中。
    
   - Test 测试类
    - @RunWith(SpringJUnit4ClassRunner.class) 使Junit用于spring上下文
    - @ContextConfiguration(classes = CDPlayerConfig.class) 要在对应的配置类中加载配置
   ### 2.2.3 基础包的扫描
   - @ComponentScan(backPackages={""}) 扫描该包下的所有类的spring注解
   - @ComponentScan(basePackageClasses = CompactDisc.class) 指定扫描与该类同包下的spring注解
  ## 2.3 通过Java 代码来装配bean
  当需要将第三方库的组件装配到你的应用， 因为没有源代码所以无法加入@Component 注解。所以需要显式配置。  
  进行显式配置 JavaConfig 是更好的方案，对重构友好。  
  **注意:** JavaConfig 是配置代码，不应该包含任何业务逻辑。
  ### 2.3.1 
  spring管理的bean默认都是单例，所以每次调用都是同一个对象，内存地址一致。
  
  ## 2.4 XML方式 装配bean
  **注意：** Java配置中的JavaConfig的每一个带有@Configuration 都对应着一个xml 文件
  ```xml
    <bean id="cdPlayer" class="work.lishubin.spring.in.action.chart.two.soundsystem.CDPlayer" 
              c:compactDisc-ref="sgtPeppers">
    </bean>
  ```
  - c 代表spring 命名空间 需要引入xsd文件
  - compactDisc 代表构建方法中的参数
  - sgtPeppers 代表bean的id
  
# 构造器注入 和 Setter方法注入
# 装配Bean
# 控制Bean的创建和销毁
