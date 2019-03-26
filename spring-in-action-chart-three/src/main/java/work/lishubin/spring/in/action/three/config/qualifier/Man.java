package work.lishubin.spring.in.action.three.config.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 李树彬
 * @date 2019/3/26  23:50
 */

@Target({
        ElementType.CONSTRUCTOR,ElementType.FIELD,
        ElementType.ANNOTATION_TYPE,ElementType.TYPE,ElementType.METHOD
})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Man {
}
