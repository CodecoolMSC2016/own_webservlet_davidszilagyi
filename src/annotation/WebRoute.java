package src.annotation;

import java.lang.annotation.*;

/**
 * Created by David Szilagyi on 2017. 06. 13..
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD})
public @interface WebRoute {
    String path() default "";
    String method() default "";
}
